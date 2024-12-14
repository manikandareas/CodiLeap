package com.manikandareas.codileap.core.data.preference

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.manikandareas.codileap.auth.domain.Token
import com.manikandareas.codileap.auth.domain.TokenSerializer
import com.manikandareas.codileap.user.domain.User
import com.manikandareas.codileap.user.domain.UserSerializer
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class PreferenceDataSource(
    private val dataStore: DataStore<Preferences>, private val ioDispatcher: CoroutineDispatcher
) {

    suspend fun saveToken(token: Token) {
        try {
            val serializedToken = TokenSerializer.serialize(token)

//            val encryptedToken = KeystoreHelper.encrypt(serializedToken)

            withContext(ioDispatcher) {
                dataStore.edit { preferences ->
                    preferences[USER_TOKEN_KEY] = serializedToken
                }
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    suspend fun clearToken() {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences.remove(USER_TOKEN_KEY)
            }
        }
    }


    fun getToken(): Flow<Token?> = dataStore.data.map { preferences ->
        val encryptedToken = preferences[USER_TOKEN_KEY] ?: return@map null

        try {
            // Dekripsi token yang sudah terenkripsi
//            val decryptedToken = KeystoreHelper.decrypt(encryptedToken)
            // Deserialisasi JSON ke objek Token
            TokenSerializer.deserialize(encryptedToken)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    suspend fun saveUser(user: User) {
        try {
            val serializedUser = UserSerializer.serialize(user)
            withContext(ioDispatcher) {
                dataStore.edit { preferences ->
                    preferences[USER_KEY] = serializedUser
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getUser(): Flow<User?> = dataStore.data.map { preferences ->
        try {
            val serializedUser = preferences[USER_KEY] ?: return@map null
            UserSerializer.deserialize(serializedUser)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    suspend fun clearUser() {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences.remove(USER_KEY)
            }
        }
    }

    suspend fun saveDarkModePreference(isDark: Boolean) {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                // Simpan preferensi atau hapus jika ingin mengikuti sistem
                if (isDark) {
                    preferences[DARK_MODE_KEY] = true
                } else {
                    preferences.remove(DARK_MODE_KEY)
                }
            }
        }
    }

    // Metode untuk mereset ke tema sistem
    suspend fun resetToSystemTheme() {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences.remove(DARK_MODE_KEY)
            }
        }
    }

    // Ambil preferensi dark mode
    val isDarkMode: Flow<Boolean> = dataStore.data.map { preferences ->
        preferences[DARK_MODE_KEY]  ?: false
    }

    // Pengaturan Reminder Studi
    suspend fun saveStudyReminder(isReminderEnabled: Boolean) {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences[STUDY_REMINDER_ENABLED_KEY] = isReminderEnabled
            }
        }
    }

    // Ambil status pengaturan reminder
    val isStudyReminderEnabled: Flow<Boolean> = dataStore.data.map { preferences ->
        preferences[STUDY_REMINDER_ENABLED_KEY] == true // Default dimatikan
    }

    // Simpan waktu reminder spesifik
    suspend fun saveReminderTime(reminderTime: String) {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences[REMINDER_TIME_KEY] = reminderTime
            }
        }
    }

    // Ambil waktu reminder
    val reminderTime: Flow<String> = dataStore.data.map { preferences ->
        preferences[REMINDER_TIME_KEY] ?: "" // Default string kosong
    }

    // Metode untuk mereset semua preferensi
    suspend fun clearAllPreferences() {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences.clear()
            }
        }
    }

    companion object {
        // Tambahkan kunci preferensi baru
        private val USER_TOKEN_KEY = stringPreferencesKey("USER_TOKEN")
        private val USER_KEY = stringPreferencesKey("USER")

        // Kunci untuk dark mode
        private val DARK_MODE_KEY = booleanPreferencesKey("dark_mode")

        // Kunci untuk pengaturan reminder
        private val STUDY_REMINDER_ENABLED_KEY = booleanPreferencesKey("study_reminder_enabled")
        private val REMINDER_TIME_KEY = stringPreferencesKey("reminder_time")
    }

}
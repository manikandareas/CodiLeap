package com.manikandareas.codileap.core.data.preference

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
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

    // Simpan jadwal belajar
    suspend fun saveStudyTime(studyTime: String) {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences[STUDY_TIME_KEY] = studyTime
            }
        }
    }

    // Ambil jadwal belajar
    val studyTime: Flow<String> = dataStore.data.map { preferences ->
        preferences[STUDY_TIME_KEY] ?: ""
    }


    // Hapus jadwal
    suspend fun clearStudyTime() {
        withContext(ioDispatcher) {
            dataStore.edit { preferences ->
                preferences.remove(STUDY_TIME_KEY)
            }
        }
    }

    companion object {
        private val USER_TOKEN_KEY = stringPreferencesKey("USER_TOKEN")
        private val USER_KEY = stringPreferencesKey("USER")
        private val STUDY_TIME_KEY = stringPreferencesKey("study_time")
    }

}
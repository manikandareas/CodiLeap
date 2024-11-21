package com.manikandareas.codileap.auth.data.preference

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.manikandareas.codileap.auth.domain.Token
import com.manikandareas.codileap.auth.domain.TokenSerializer
import com.manikandareas.codileap.core.data.util.KeystoreHelper
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

            val encryptedToken = KeystoreHelper.encrypt(serializedToken)

            withContext(ioDispatcher) {
                dataStore.edit { preferences ->
                    preferences[USER_TOKEN_KEY] = encryptedToken
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
            val decryptedToken = KeystoreHelper.decrypt(encryptedToken)
            // Deserialisasi JSON ke objek Token
            TokenSerializer.deserialize(decryptedToken)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    companion object {
        private val USER_TOKEN_KEY = stringPreferencesKey("USER_TOKEN")
    }

}
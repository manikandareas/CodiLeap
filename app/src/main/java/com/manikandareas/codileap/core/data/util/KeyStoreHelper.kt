package com.manikandareas.codileap.core.data.util

import com.manikandareas.codileap.BuildConfig
import java.nio.charset.StandardCharsets
import java.security.KeyStore
import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec


object KeystoreHelper {

    private const val KEY_ALIAS = BuildConfig.APP_SECRET_KEY  // Alias untuk kunci

    // Mendapatkan kunci dari Keystore
    fun getKey(): SecretKey {
        val keyStore = KeyStore.getInstance("AndroidKeyStore").apply { load(null) }
        return keyStore.getKey(KEY_ALIAS, null) as SecretKey
    }

    // Mengenkripsi data
    fun encrypt(data: String): String {
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        val key = getKey()

        // Menginisialisasi cipher untuk enkripsi
        cipher.init(Cipher.ENCRYPT_MODE, key)

        // Melakukan enkripsi
        val iv = cipher.iv  // Menyimpan IV untuk dekripsi nanti
        val encryption = cipher.doFinal(data.toByteArray(StandardCharsets.UTF_8))

        // Gabungkan IV dengan ciphertext
        val ivAndCipherText = ByteArray(iv.size + encryption.size)
        System.arraycopy(iv, 0, ivAndCipherText, 0, iv.size)
        System.arraycopy(encryption, 0, ivAndCipherText, iv.size, encryption.size)

        return Base64.getEncoder().encodeToString(ivAndCipherText)
    }

    // Mendekripsi data
    fun decrypt(encryptedData: String): String {
        val ivAndCipherText = Base64.getDecoder().decode(encryptedData)

        // Pisahkan IV dan ciphertext
        val iv = ByteArray(12)  // GCM biasanya menggunakan IV sepanjang 12 byte
        val cipherText = ByteArray(ivAndCipherText.size - iv.size)
        System.arraycopy(ivAndCipherText, 0, iv, 0, iv.size)
        System.arraycopy(ivAndCipherText, iv.size, cipherText, 0, cipherText.size)

        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        val key = getKey()

        // Menginisialisasi cipher untuk dekripsi
        val spec = GCMParameterSpec(128, iv)  // 128-bit authentication tag
        cipher.init(Cipher.DECRYPT_MODE, key, spec)

        // Dekripsi ciphertext
        val decryptedData = cipher.doFinal(cipherText)

        return String(decryptedData, StandardCharsets.UTF_8)
    }
}

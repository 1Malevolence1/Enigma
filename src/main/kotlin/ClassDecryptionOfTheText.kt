import java.security.KeyPairGenerator
import java.security.KeyPair
import javax.crypto.Cipher
import java.security.Signature


class ClassDecryptionOfTheText : DecryptionOfTheText {


    override fun decryptionOfTheText(text: String) {
        val keyPairGen = KeyPairGenerator.getInstance("RSA")
        keyPairGen.initialize(2048)
        keyPairGen.genKeyPair()
        val pair = keyPairGen.generateKeyPair()
        val publicKey = pair.public
        val cipher = Cipher.getInstance("RSA / ECB /PKCS1Padding")
        cipher.init(Cipher.ENCRYPT_MODE, publicKey)
        val input: ByteArray = text.toByteArray()
        cipher.update(input)
        val cipherText: ByteArray = cipher.doFinal()
        cipher.init(Cipher.DECRYPT_MODE, pair.private)

        println("Зашифрованный текст:")
        println(String(cipherText))
        cipher.init(Cipher.DECRYPT_MODE, pair.private)

        val decipheredText: ByteArray = cipher.doFinal(cipherText)
        println("Расшифрованный текст:")
        println(String(decipheredText))

    }
}






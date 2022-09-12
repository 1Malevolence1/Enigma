import java.lang.StringBuilder
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class TextEncryptionClass() : TextEncryption{

    @Throws (NoSuchAlgorithmException::class)
    override fun textEncryption(inByte : ByteArray, type : String ) : String {



       val digestedBytes =  MessageDigest.getInstance(type).digest(inByte)
       return with(StringBuilder()){
            digestedBytes.forEach { b -> append(String.format("%02X", b)) }
            toString().toLowerCase()
        }
    }
}
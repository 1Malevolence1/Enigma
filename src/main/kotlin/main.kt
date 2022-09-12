fun main(){

    println("Приветсвую тебя, пользователь. Перед тобой шифровальная машина Энигма")
    Thread.sleep(3000)
    println("Выберите способоб как вы хотиете зашифровать")
    println("1 - SHA-256\n" +
            "2- MD5")

    val number = readLine()
    when(number){

        "1" -> {
            println("Напишиет текст, который вы хотиете зашифровать")
            val text = readLine()
            println("Зашифрованный текст ↓")

            println(TextEncryptionClass().textEncryption(text!!.toByteArray(),"SHA-256"))
        }

        "2" -> {
            println("Напишиет текст, который вы хотиете зашифровать")
            val text = readLine()
            println("Зашифрованный текст ↓")

            println(TextEncryptionClass().textEncryption(text!!.toByteArray(),"MD5"))

        }



    }



}
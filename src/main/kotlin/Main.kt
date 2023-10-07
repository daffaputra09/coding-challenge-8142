import java.text.DecimalFormat

fun main(args: Array<String>) {
    while (true){
        print("Masukkan angka: ")

        val input_number = readln()
        try {
            val number = input_number.toLong()

            for (i in 1..number){
                val cubic = i*i*i
                if(cubic < Long.MAX_VALUE) println("Current Number is: $i and the cube is $cubic")
                else println("Hasil cubic lebih dari ${Long.MAX_VALUE}")
            }
        }
        catch (e: Exception){
            println("HANYA BISA MEMASUKKAN ANGKA DAN LEBIH DARI 0")
        }
    }
}
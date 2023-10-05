fun main(args: Array<String>) {
    while (true){
        print("Masukkan angka: ")

        val input_number = readln()
        try {
            val number = input_number.toInt()

            for (i in 1..number){
                val cubic = i*i*i
                println("Current Number is: $i and the cube is $cubic")
            }
        }
        catch (e: Exception){
            println("HANYA BISA MEMASUKKAN ANGKA")
        }
    }
}
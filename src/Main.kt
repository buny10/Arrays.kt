fun main(args: Array<String>) {
    val names: Array<String> = arrayOf("John", "JP", "Hulash")
    val numbers = arrayOf(4, 5, 6,"name 1",'a')
    names[0] = "Ina"
    println("First element: ${names[0]}")
    println("the size if array is ${names.size}")

    for(i in numbers)
        if (i is Char){
            println(i)
        }

}
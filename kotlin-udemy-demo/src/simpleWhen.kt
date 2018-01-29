
fun main(args:Array<String>) {

    val number:Int? = readLine()?.toInt()

    when(number){
        1 -> print("value is 1")
        2 -> print("value is 2")
        3 -> print("value is 3")
        in 4..10 -> {
            print("value is 4 or 10")
        }
        !in 11..20 -> {
            print("value not beteewn 11 and 20")
        }
        else -> print("unknow number")
    }
}
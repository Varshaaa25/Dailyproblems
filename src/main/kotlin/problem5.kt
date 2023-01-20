fun main()
{
    println("Enter value of a:")
    var a= readLine()?.toInt()!!
    if(a%2.0==0.0) println("$a is even") else println("$a is odd")
}
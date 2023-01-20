fun main()
{
    println("Enter principle amount,time and rate of interest:")
    var p=readLine()?.toDouble()!!
    var t= readlnOrNull()?.toInt()!!
    var r=readLine()?.toDouble()!!
    var simpleInterest=(p*t*r)/100
    println("The simple interest is:$simpleInterest")

}
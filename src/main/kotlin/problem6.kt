fun main()
{
    println("enter value of a:")
    var a=readLine()?.toDouble()!!
    if(a>0)
    {
        println("The number $a is positive")
    }
    else if(a<0)
    {
        println("The number $a is negative")
    }
    else
    {
        println("the number is zero")
    }
}
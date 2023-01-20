fun main()
{
    println("enter value of a,b,c:")
    var a= readLine()?.toDouble()!!
    var b= readLine()?.toDouble()!!
    var c= readLine()?.toDouble()!!
    if(a>=b && a>=c)
    {
        println("Greatest of three no. is:$a")
    }
    else if(b>=c)
    {
        println("Greatest of three no. is:$b")
    }
    else
    {
        println("Greatest of three no. is:$c")
    }




}
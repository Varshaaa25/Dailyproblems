fun main()
{
    println("enter values of a and b:")
    var a=readLine()?.toDouble()!!
    var b=readLine()?.toDouble()!!
    var temp:Double
    temp=a
    a=b
    b=temp
    println("the value of a and b after swapping is :a=$a and b=$b")

}
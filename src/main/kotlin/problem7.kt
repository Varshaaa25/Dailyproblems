fun main()
{
    println("enter a year:")
    var year=readLine()?.toInt()!!
    if(year%4==0) println("$year is leaf year") else println("$year is not a leaf year")
}
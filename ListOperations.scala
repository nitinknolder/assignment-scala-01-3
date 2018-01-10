class ListOperations {

 /* def area(shape:String,length:Int,breadth: Int, f:(Int,Int)=> Int):Int = {
    var length = 0
    var breadth = 0

    f(length * breadth)
    f({(length * breadth)/2)
  }*/

  def sumOfList(listNew1: List[Int], listNew2: List[Int]): List[Int] = {
      val vector1 = for (iteration <- 0 until listNew1.length) yield listNew1 (iteration) + listNew2 (iteration)
      val Sum = vector1.toList
    Sum

  }


  def findLength(newList: List[Int])
{
val xiteration= 0
var temp = 0
  for (xiteration <- newList)
  {
   temp = xiteration
  }
  print ("Length = " + temp+ "/n")
}

  //**************************************************
  def mapUse(list: List[Int])
  {
    print("List before using map: "+ list+"/n")
    print("List after using map:/n " + list.map(x =>  x * 2))
  }

 def fibo(prev: Int,next:Int,num: Int):Int = {

   num match {
     case no1 => prev
     case no2 => next
     case _ => fibo(next, prev + next, num-1)
   }
 }

  def reverseOfList(list1: List[Int])= list1.reverse
  def reverseList(list1: List[Int]):List[Int] = {


    list1 match {
      case rev1:: tail => reverseOfList(tail) ::: List(rev1)
      case Nil => Nil
    }
  }
}




object Operations{
  def main(arg:Array[String]) {
    val listob = new ListOperations
    val value1 = 1
    val value2 = 2
    val value3 = 3
    val value4 = 4
    val newList = List (value1,value2,value3,value4)
    val listNew1 = List (value1,value2,value3,value4)
    val listNew2 = List (value1,value2,value3,value4)
   print("Reverse Of a List is: " + listob.reverseOfList(newList)+"/n")
    listob.findLength(newList)
    val list =List(4,5,6)
    listob.mapUse (list)
    print("SumOfList" + listob.sumOfList(listNew1,listNew2)+"/n")
    val fib1 = 0
    val fib2 = 1
    val fib3 = 3
    println("Fibonacci: " + listob.fibo(fib1,fib2,fib3))
  }
}

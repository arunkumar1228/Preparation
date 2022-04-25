object Scala_Array extends App {
  var myList = Array(1, 2, 3, 4, 6,5,7,6)
  scala.util.Sorting.quickSort(myList)
  for(i <- myList)
    println(i)

  val a =myList.max
    var m=myList.length-1
  while (myList(m) == myList(myList.length-1)) {
    m = m-1
    println("The first max value is "+ a + " The second max value is " + myList(m) + " The value is " + (myList(m)+a) )
  }

}

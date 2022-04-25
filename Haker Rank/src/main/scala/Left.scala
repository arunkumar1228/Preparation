import scala.annotation.tailrec

object Left extends App{
  def rotateArray(A: Array[Int], K: Int): Array[Int] = {
    if (A.isEmpty) A
    else rotate(A.toList, K).toArray
  }

  def rotateStepwise(l: List[Int]): List[Int] = {
    l.take(l.size - 1).+:(l.last)
  }

  @tailrec
  def rotate(l: List[Int], K: Int): List[Int] = {
    if (K == 0) l
    else rotate(rotateStepwise(l), K - 1)
  }
    var arr = Array(1, 5, 6, 8, 12, 7)
    print("Initial Array : ")
    for(i <- 0 to arr.length-1){
      print(arr(i)+" ")
    }
    var a = rotateArray(arr, 1)
    print("Array after right rotation : ")
    for(i <- 0 to a.length-1){
      println(a(i)+" ")
    }
}

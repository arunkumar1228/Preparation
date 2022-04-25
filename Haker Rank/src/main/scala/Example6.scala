import scala.collection.mutable.ArrayBuffer

object Example6 extends App {
  val array1 = Array(1, 2, 3, -1, -2, -3)
  val add = ArrayBuffer[Int]()
  val sub = ArrayBuffer[Int]()

  for (i <- array1) {
    if (i > 0) {
      add += i
    }
    else if (i < 0) {
      sub += i
    }
    else
      println("non")
  }
  println("Add" + add)
  println("Sub" + sub)
}
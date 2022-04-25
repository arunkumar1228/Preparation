object different extends App{
  def dif(x:Int)={
    val absd=Math.abs(x-51)
    if(x>51)
      3*absd
    else
      absd
  }
println("The value is "+ dif(52))
  println("The value is "+ dif(50))
}

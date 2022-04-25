object fact extends App{
  def fact(num:Int):Int={
    if(num ==0 || num == 1 )
      num
    else
      num * fact(num - 1)
  }
println( "The value is "+ fact(7))
}

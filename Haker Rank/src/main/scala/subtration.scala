object subtration extends App{
  def sub (q:Int):Boolean={
    if(Math.abs(100-q)<=20||Math.abs(300-q)<=20)
      true
    else
      false
  }
println(sub(120))
  println(sub(400))
}

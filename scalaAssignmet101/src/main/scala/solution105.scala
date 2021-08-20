object solution105 extends App {

def nearest(x:Int,y:Int):Int = {

  val number = 100

  val N1 = Math.abs(number-x)
  val N2 = Math.abs(number-y)

  if (N1<N2) x
  else if (N1==N2) 0
  else y

}

  println(nearest(80,120))

}

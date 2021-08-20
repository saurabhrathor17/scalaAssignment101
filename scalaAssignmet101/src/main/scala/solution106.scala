object solution106 extends App{

def rangeCheck(x:Int,y:Int):Boolean={

  val condition = x<=20 && y>=50 || y<=20 && x>=50
  if (condition==true) true
  else  false
}
  println(rangeCheck(100,400))
}

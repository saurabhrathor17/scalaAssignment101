object solution104 extends App {

def ifProblem(str:String):String = {

  if (str.startsWith("if")) str
  else "if" + str
}
  println(ifProblem(" string addedfront if"))
  println(ifProblem("if already here "))

}

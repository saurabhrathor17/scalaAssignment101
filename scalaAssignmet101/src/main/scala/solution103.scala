object solution103 extends App {

def strReverse(str:String):String = {
  val lastChar = str.reverse.charAt(0)
  val newString = lastChar+str+lastChar
  newString
}
println(strReverse("Scala"))
}

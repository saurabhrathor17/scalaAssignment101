object solution102 extends App {

  def stringRemove(str:String,num:Int):String={

    val newString = str.take(num)+str.drop(num+1)
    newString
  }
println(stringRemove("Scala",1))
println(stringRemove("Scala",0))
println(stringRemove("Scala",4))


}

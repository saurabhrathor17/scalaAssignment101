object solution107 extends App{
  def happyChar(num:Int):String ={

    val str = "apppbbcccddeeefghhhijklll"

    val happy_condition = str.charAt(num)==str.charAt(num-1) && str.charAt(num)==str.charAt(num+1)

    if (happy_condition==true) "happy"
    else "unhappy"

  }
println(happyChar(1))
}

/**
 *Input à Given string = “India”

Expected Output à In, In, In, In à InInInIn
 */

object solution101 extends App{
    def stringProb(str: String):String ={

    if (str.length<2) str
    else str.substring(0, 2) * 4
  }
  println(stringProb("India"))

}

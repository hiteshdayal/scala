package MarkLewis

object tryCatch {

  val str = "123a"
  val number = try {
    str.toInt
  }catch {
    case ex:NumberFormatException => "Exception occurs " + ex
    case exp: Exception => exp // just trying
  }
  println(number)

  // JUST TESTING --------------
  val things:Int= {
    def thing1(x:Int): Int ={
      x*x
    }
    val a = thing1(2)
    a
  }
  println(things)
 //-----------------------------

  def main(args:Array[String]): Unit ={

  }
}

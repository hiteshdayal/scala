package Practice

class TestingHello {
    println("Hello")
  def testmeth1():Int = {
    4
  }

  def sum(x:Int,y:Int):Int = x+y
  // ANONYMOUS FUNCTION //-------------
  var a = (x:Int,y:Int)=>x+y
  //------------------
  val b = {
    12
  }
}
object TestingHello {
  def main(args:Array[String]): Unit ={
    val obj = new TestingHello
    println(obj.testmeth1())
    println(obj.sum(2,3))
    println(obj.a(2,6))
    println(obj.b)
  }
}
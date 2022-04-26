package MarkLewis

object Lambda {

  var square:Double => Double = x => x*x
  println(square(3))

  val lt:(Double,Double) => Boolean = _ < _  // underscore means something is less than something
  println(lt(4,5))                       // , we can not use _ in case of x*x because scala understand x*y not x*x
  println(lt(6,5))


  def main(args:Array[String]): Unit ={

  }

}

package MarkLewis

object Match {

  val fizzbuzz = for (i<-1 to 20) yield{
    (i%3,i%5) match{
      case(0,0) => "fizzbuzz"
      case(0,_) => "fizz"
      case(_,0) => "buzz"
      case _ => i.toString
    }
  }
  println(fizzbuzz)


  def main(args:Array[String]): Unit ={

  }
}

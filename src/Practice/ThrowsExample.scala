package Practice

class ExceptionExamples{

  @throws(classOf[NumberFormatException])
  def validate(): Unit ={
    "abc".toInt
  }



}

object ThrowsExample {
  def main(args:Array[String]): Unit ={
    val obj = new ExceptionExamples()
    try {
      obj.validate()
    }
    catch {
      case e:NumberFormatException => println("Exception occured "+ e)
    }

  }
}

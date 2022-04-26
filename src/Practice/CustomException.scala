package Practice

class InvalidAgeException(s:String) extends Exception(s)

class ExceptionExp{
  //@throws(classOf[InvalidAgeException])
  def validate(age:Int): Unit ={
    if(age<18){
      throw new InvalidAgeException("Not Eligible")
    }
    else{
      println("Eligible")
    }
  }
}

object CustomException {
  def main(args:Array[String]): Unit ={
    var obj = new ExceptionExp
    try{
      obj.validate(17)
    }
    catch {
      case e:Exception => println("Error occured "+ e)
    }
  }
}

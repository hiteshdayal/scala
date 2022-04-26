package Practice

class Exception1{
  def excp1(): Unit ={
    try{
      var a =100
      var b = 0
      println(a/b)
    }catch {
      case e => println("Cannot divide by zero " + e)
    }
  }
}

class Exception2{
  def excp2(): Unit ={
    var arr = Array(1,2,3,4,5)
    try{
      println(arr(6))
    }
    catch {
      case e:ArithmeticException => println("Arithmatic Exception " + e)
      case ex:ArrayIndexOutOfBoundsException => (println("Array out of bound exception " + ex))
      case exp:Throwable => println("Throwable Exception" + exp)
    }
    finally {
      println("Finally block executes")
    }
  }
}

class TestingThrow{
  def throwTest(): Unit ={
    var age = 17
    if(age<18){
      throw new ArithmeticException("You are not eligible to vote")
    }
    else{
      println("You are eligible")
    }
  }
}

object ExceptionExample {
  def main(args:Array[String]): Unit ={
    val obj1 = new Exception1
    obj1.excp1()
    val obj2 = new Exception2
    obj2.excp2()
    val obj3 = new TestingThrow
    obj3.throwTest()
  }
}

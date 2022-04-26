package Practice

trait TraitExample1{
  def traitMeth()
}

//If a class extends a trait but does not implement the members declared in that trait,it must be declared abstract.
abstract class TestingClass extends TraitExample1{
  def meth2(): Unit ={
    println("Testing class method called")
  }
}

object Traits1 {
  def main(args:Array[String]): Unit ={

  }
}

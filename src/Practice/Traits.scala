package Practice

trait TestingTrait{
  def traitMeth(): Unit ={
    println("Testing trait")
  }
}
class TraitClass extends TestingTrait{
  override def traitMeth(): Unit = super.traitMeth()
}

class TraitExample extends TestingTrait{
  def meth1(): Unit ={
    println("Trait Example method")
  }
}


object Traits {
  def main(args:Array[String]): Unit ={
    val obj = new TraitClass
    obj.traitMeth()
    val obj1 = new TestingTrait{  // Calling trait like an interface
      traitMeth()
    }
    val obj2 = new TraitExample
    obj2.meth1()

  }
}

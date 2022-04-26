package Practice

case class CaseClass1(empId:Int,empName:String){
  def meth(): Unit ={
    println("Case class method "+empId)
  }
}
case class CaseExample(empId:Int,empName:String)

object Test{
  def objmeth(): Unit ={
    println("Object method called")
  }
}

object caseClass {
  def main(args:Array[String]): Unit ={
    val obj = CaseClass1(1001, "Sourabh")
    obj.meth()
    val obj1 = CaseExample(1002,"Ankur")
    println(obj1.empId+" "+obj1.empName)
    val list = List(CaseExample(1002,"Manish"),CaseExample(1003,"Harish"),CaseExample(1004,"Manisha"))
    println(list.filter(_.empId>1002).toList)
    println(list.filter(e=>e.empId>1003).map(e=>e.empName).toList)

    Test.objmeth()

  }
}

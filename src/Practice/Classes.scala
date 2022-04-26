package Practice

class Employee(empId:Int, empName:String, empAdd:String){

  var id:Int = empId
  var name:String = empName
  var address:String = empAdd

  def printEmployee()={
    println("Employee Id => "+empId +" Employee Name => "+ empName +" Employee Address => "+ empAdd)
  }


  override def toString = s"Employee($id, $name, $address)"
}

class Employee1(id:Int,name:String){

}

object Classes {
  def main(args:Array[String]): Unit ={
    var x:String = null
    //println(x.length)
    val obj = new Employee(1001,"Sourabh", "Patna")
    println(obj)
    val a = List(new Employee(1001,"Sourabh", "Patna"),new Employee(1002,"Ankur", "Noida"),new Employee(1003,"Manish", "Noida"))
    println(a.head.name)
    println(a.filter(_.id>1001).map(_.name))
    println(a.filter(e=>e.id>100&&e.address!="Noida"))

    val obj2 = new Employee1(11,"lenovo")


  }
}

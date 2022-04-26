package MarkLewis

object VariablesTypes {
  def main(args:Array[String]): Unit ={
    val name="pat cook"
    val value = 32
    var age = 23
    age+=1
    println(name+ " "+value+" "+age)

    // TUPLES ///////////
    val t = (1,3.5,"hello there")
    val (a,b,c) = t
    println(a+" "+b+" "+c)
    println(t._3)
  ///////////////
    // STRING INTERPOLATION
    var message = s"$name is $age years old"
    var message2= s"${name} is ${age} years old ${t._2}"
    println(message +" message 2 => "+message2)

    println(value + age)
    println(name == "pat cook")


  }
}

package MarkLewis
// STRINGS AS SEQUENCE
object StringsOperations {
  def main(args:Array[String]): Unit ={
    var str = "This is a test"
    println(str.filter(_<'l').toList)

    println(str.filter(e=>"aeiou".contains(e)).toList)
    println("Split")
    println(str.split(" ").toList)
  }
}

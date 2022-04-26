package Practice

object StringOperations {
  def main(args: Array[String]): Unit = {
    val str = "Hello world"
    println(str.filter(e=>"aeiou".contains(e)).toList)
    println(str.contains('e'))
    println(str.substring(2,7))
    println(str.charAt(5).toInt)
    println(str.split(" ").toList)
  }
}

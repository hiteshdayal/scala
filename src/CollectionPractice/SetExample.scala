package CollectionPractice
//import scala.collection.immutable
object SetExample {
  def main(args:Array[String]): Unit ={
    val set = Set()
    var games = Set("Football", "Volleyball", "Cricket", "Hockey", "Golf")
    println(set)
    println(games)
    println(games.head)
    println(games.tail)
    println(games.isEmpty)

    val alphabet = Set("A","B","C","D","E")
    println(games.concat(alphabet))
    println(games.contains("Football"))

    games += "Racing"
    println(games)
    println(games.zipWithIndex.mkString(","))





  }
}

package MarkLewis
// HIGHER ORDER FUNCTIONS
object ArrayOperations1 {
  def main(args:Array[String]): Unit ={

    var a = Array(7,9,5,6,43,2)
    println("Printong array")
    a.foreach(println)
    println("Map")
    a.map(_*2).foreach(println) // underscore means something i.e, something multiplied by 2
    println("Filter")
    a.filter(_<5).foreach(println)
    println("Filter 1 ")
    a.filter(_%2==0).foreach(println)

    println("Count")
    println(a.count(_%2==0))
    println("Exists")
    println(a.exists(_<5))
    println("Exists 1")
    println(a.exists((_>50)))
    println("Forall")
    println(a.forall(_<5))
    println("Find")
    a.find(_<10).foreach(println)
    println("Partitioning array")
    var b = a.partition(_<8) // partitioning array having no. lt 8 are in another array and gt 8 are in other array
    println(b._1.toList, b._2.toList)

  }
}

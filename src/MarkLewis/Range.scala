package MarkLewis

import scala.math.BigDecimal.double2bigDecimal

object Range {
  def main(args:Array[String]): Unit ={

    var range = 1 to 10  // to inclusive
    range.foreach(e=>print(e))

    println("Until ")
    var range1 = 1 until 10  // until exclusive
    range1.foreach(e=>print(e))
    println("\nBy 2")
    var range2 = 1 to 10 by 2
    range2.foreach(e=>print(e))
    println("a to z")
    var range3 = 'a' to 'z'
    range3.foreach(e=>print(" "+e))
    println("Double range ")
    var doubleRange = 1.0 to 10.0 by 2
    doubleRange.foreach(e=>print(" "+e))

  }
}

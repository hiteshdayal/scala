package MarkLewis

import scala.io.StdIn.{readInt, readLine}

// LISTS RECURSION PATTERNS
object ListsRecusrion {
  def main(args:Array[String]): Unit ={
    println("what is your name ")
    val name = readLine()
    println("How old are you ")
    val age = readInt()

    val lst = buildList()
    //println(lst) uncomment for build list function to print
    println(concatStrings(lst))

  }
  def buildList():List[String] = {
    val input = readLine()
    //println(input)
    if (input == "q") Nil
    else input::buildList()
  }

  def concatStrings(words:List[String]): String = {
    if(words.isEmpty) ""
    else words.head + concatStrings(words.tail)
  }

}

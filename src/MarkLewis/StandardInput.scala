package MarkLewis

import scala.io.StdIn.readLine

object StandardInput {

  def main(args:Array[String]): Unit ={
    println("Enter yoour name")
    val name = readLine
    println("Enter your age")
    val age = readLine()
    println(name +" "+age)
  }
}

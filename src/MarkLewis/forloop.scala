package MarkLewis

object forloop {

  for(i<-1 until 10; if i%3==0 ){
    println(i)
  }
  //// OR

  for{
    i<-0 until 10
    if i%3==0 || i%5==0
    sqr = i*i
    j<- 'a' to 'c'
  }{
    print(i+" "+j)
  }
  println()
  ////////  OR

  val stuff = for{                // Expression gives us result
    i<-0 until 10
    if i%3==0 || i%5==0
    sqr = i*i
    j<- 'a' to 'c'
  }yield{
    i->j
  }
  println(stuff)

  def main(args:Array[String]): Unit ={

  }
}

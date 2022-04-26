package MarkLewis

object ArrayList {
  def main(args:Array[String]): Unit ={
    val arr = Array(4,6,46,67,32)
    println(arr)
    for(i<-0 to arr.length-1){
      println(arr(i))
    }
    println("Array.fill")
    var arr1 = Array.fill(4)(1)  // fill 4 no. with 1
    arr1.foreach(x=>println(x))
    //var arr2 = Array.fill(5)(io.StdIn.readLine())
    //arr2.foreach(x=>println(x))

    println("Array.tabulate")
    var arr3 = Array.tabulate(5)(i=>i) // prints index
    for (elem <- arr3) {
      println(elem)
    }

    var arr4 = new Array[Int](10)
    for(e<-arr4){
      println(e)
    }


  }
}

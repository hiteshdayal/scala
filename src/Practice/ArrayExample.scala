package Practice

object ArrayExample {
  def main(args:Array[String]): Unit ={
    var arr = new Array[Int](5)
    arr(0) = 10
    arr(1) = 45
    arr(2) = 40
    arr(3) = 56
    arr(4) = 23
    for(x<-arr){
      println(x)
    }
    var sum=0
    for(x<-arr){
      sum +=x
    }
    println("Total Sum = "+ sum)

    for(x<-1 to 5){
      for(y<-1 to x){
        print("*")
      }
      println()
    }

  }
}

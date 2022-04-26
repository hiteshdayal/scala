package MarkLewis

object ArrayOperations {
  def main(args:Array[String]): Unit ={

    var arr = Array(5,6,7,8,3,4,9)
    var arr1 = arr.drop(2)
    arr1.foreach(e=>print(e+" "))
    println("\nDrop right")
    var arr2 = arr.dropRight(2)
    arr2.foreach(e=>print(e+" "))
    println("\nArray head")
    println(arr.head)
    println("\nArray tail")
    println(arr.tail)
    println("\nArray dot last")
    println(arr.last)
    println("SplitAt")
    var arr3 = arr.splitAt(3)
    arr3._1.foreach(e=>println(e))
    println()
    arr3._2.foreach(e=>println(e))
    println("take")
    arr.take(3).foreach(e=>println(e))
    println("takeRight")
    arr.takeRight(3).foreach(e=>println(e))
    println("Slice")
    arr.slice(0,3).foreach(e=>println(e))

    println("Patch")
    var arr4 = arr.patch(2,Array(87,98),2) // removing element and inserting in between (in place of 7,8)
    println(arr4.toList)
    var arr5 = arr.patch(2,Array(87,98),0) // adding element without removing in between (7,8 are not removed)
    println(arr5.toList)

    println("Array difference")  // converting to list, if not use loop, don't get confused
    var arr6 = arr.diff(Array(5,6)) // removing the element from the array if they  match
    println(arr6.toList)

    println("Array difference ")
    println(arr.diff(Array(5,6,7)).toList)
    println(arr.toList.splitAt(3))

    println("Array distinct")  // removing the duplicates from the array
    var newArray = Array(11,2,3,4,3,4,5,6,7,5,7).distinct
    println(newArray.toList)
    println("Array intersect")  // only common
    var arr7 = newArray.intersect(Array(5,6,71,2,3,4))
    println(arr7.toList)
    println("Union")
    println(arr.union(arr7).toList)


    println("Min")
    println(newArray.min)
    println("Max")
    println(newArray.max)
    println("Sum")
    println(newArray.sum)
    println("Product")
    println(newArray.product)
    println("Sorted")
    println(newArray.sorted.toList)

    println("Make String")  // all the three version below
    println(newArray.mkString)
    println(newArray.mkString(","))
    println(newArray.mkString("[",",","]"))

    println("Array zipWithIndex") // getting each value with its indices or index
    println(arr.zipWithIndex.mkString(",")) // just testing thats why using mkstring, if not then use loop or use repl
    print(arr.zip(1 to arr.length-1).mkString(","))
  }
}

import scala.collection.mutable.ArrayBuffer

object mainTask2 extends App {

  var test: List[String] = List("Charlie", "Paul", "Steven", "Luc")
  println(test.sortWith(_ < _))

  println(test.contains("Paul"))

  var testModif : List[String] = test.filterNot(_ == "Paul")
println(testModif.sortWith(_>_))


}

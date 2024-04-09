
class LinkedListSuite2 extends LinkedListSuite() {







}


object mainTask6 extends App {

  var flightList: LinkedListSuite2 = new LinkedListSuite2()
  println(flightList)
  flightList.addToStart("Rome")
  println(flightList)
  flightList.addToStart("Paris")
  println(flightList)
  flightList.addToStart("Tokyo")
  println(flightList)
  println(flightList.findElement("Paris").item)
  flightList.swapElements("Tokyo","Rome")
  println(flightList)



}

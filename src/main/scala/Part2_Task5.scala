import mainTask3.b

class LinkedListSuite extends LinkedList() {






}

object mainTask5 extends App {

  var flightList: LinkedListSuite = new LinkedListSuite()
  println(flightList)
  flightList.addToStart("Rome")
  println(flightList)
  flightList.addToStart("Paris")
  println(flightList)
  flightList.addToStart("Tokyo")
  println(flightList)
  flightList.removeFirstElement()
  println(flightList)
  println(flightList.getLastElement().item)
  flightList.addToEnd("Chicago")
  println(flightList)
  println(flightList.isPresent("Rome"))
  println(flightList.isPresent("Bagdad"))

}
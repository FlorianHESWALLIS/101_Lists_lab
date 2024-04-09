
class Node () {

  var item : String = item
  var next : Node = next
  def this(item0: String, next0: Node) = {
    this()
    item = item0
    next = next0
  }

}




object mainTask3 extends App {

  val all: Node = new Node("Tokyo", new Node("Paris", new Node("Milan", null)))

  val a: Node = new Node("Milan", null)
  val b: Node = new Node("Paris", a)
  val c: Node = new Node("Tokyo", b)



}
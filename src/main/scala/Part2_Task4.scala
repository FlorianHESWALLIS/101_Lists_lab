

class LinkedList () {

  var head: Node = null


  def isPresent(text: String): Boolean = {
    var current: Node = head
    var result: Boolean = false

    while (current != null) {
      if (current.item == (text)) {
        result = true
      }
      current = current.next
    }

    return result
  }



  def addToStart(s: String): Unit = {

    head = new Node(s, head)

  }

  def getSize(): Int = {

    var current: Node = head
    var count: Int = 0
    while (current != null) {
      count += 1
      current = current.next
    }

    return count

  }

  override def toString(): String = {
    var s: String = s"List content (size ${getSize()})"

    var current: Node = head

    while (current != null) {
      s += " -> " + current.item
      current = current.next
    }

    s + " -> null"

  }

  def removeFirstElement(): Unit = {
    if (head != null) {
      head = head.next
    }
  }

  def getLastElement(): Node = {
    var current: Node = head
    var last: Node = head

    while (current != null) {
      last = current
      current = current.next
    }

    return last
  }

  def addToEnd(element: String): Unit = {

    if (head != null) {
      getLastElement().next = new Node(element, null)
    }
    else {
      addToStart(element)
    }


  }

  def findElement(s: String): Node = {
    var current: Node = head

    while (current != null) {
      if (current.item == s) {
        return current
      }
      current = current.next
    }

    return null
  }

  def swapElements(e1: String, e2: String): Unit = {
    var current1: Node = findElement(e1)
    var current2: Node = findElement(e2)

    if (current1 != null && current2 != null) {
      val text: String = current1.item
      current1.item = current2.item
      current2.item = text
    }


  }

  def removeLastElement(): Unit = {
    var current: Node = head
    var previous: Node = null
    while (current != null) {
      if (current.next == null) { // Normal case
        if (previous != null) {
          previous.next = null
        }
        else { // Special case if the list contains a single element
          head = null
        }
        return
      }
      previous = current
      current = current.next
    }
  }

  def removeElement(s: String): Unit = {
    val i = findElement(s)
    if (i == null) return
    if (i == head) {
      head = head.next
      return
    }
    var j = head
    while (j.next != i) {
      j = j.next
    }
    j.next = i.next
  }

  def insertAfter(a: String, b: String): Unit = {
    val tmp = findElement(a)
    if (tmp == null) {
      return
    }
    val newNode = new Node(b, tmp.next)
    tmp.next = newNode
  }
}

  object mainTask4 extends App {

  var flightList:LinkedList = new LinkedList()
  println(flightList)
  flightList.addToStart("Rome")
  println(flightList)
  flightList.addToStart("Paris")
  println(flightList)
  flightList.addToStart("Tokyo")
  println(flightList)




}
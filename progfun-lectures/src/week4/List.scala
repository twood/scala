package week4

trait List[T] {
	def head: T
	def tail: List[T]
	def isEmpty: Boolean
	def toString: String
}

class Nil[T] extends List[T] {
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
  def isEmpty = true
  override def toString = "nil"
}

class Cons[T] (val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
  override def toString = "{" + head + ", " + tail + "}"
}

object List {
  // List(1, 2)
  
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
  def apply[T](x1: T): List[T] = new Cons(x1, new Nil)
  def apply[T]() = new Nil
}
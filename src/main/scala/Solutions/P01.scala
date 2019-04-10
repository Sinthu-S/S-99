package Solutions

import scala.annotation.tailrec

// P01 (*) Find the last element of a list.

object P01 {

  @tailrec
  def lastRec[T](l:List[T]):T = l match {
    case head::Nil => head
    case _::tail => lastRec(tail)
    case _ => throw new NoSuchElementException("Empty")
  }

  def main(args: Array[String]): Unit = {
    println(lastRec(List(1, 1, 2, 3, 5, 8)))
  }
}

package Solutions


// P02 (*) Find the last but one element of a list.

object P02 {

  def penultimateRec[T](l:List[T]):T = l match {
    case head::_::Nil => head
    case _::tail => penultimateRec(tail)
    case _ => throw new NoSuchElementException("Empty")
  }

  def main(args: Array[String]): Unit = {
    println(penultimateRec(List(1, 1, 2, 3, 5, 8)))
  }
}

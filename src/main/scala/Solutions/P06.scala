package Solutions


object P06 {

  def palindrome[T](l:List[T]):Boolean = l match {
    case _::Nil | Nil => true
    case head::(mid:+last) => if (head == last) palindrome(mid) else false
  }

  def main(args: Array[String]): Unit = {
    println(palindrome((List(1, 2, 8, 3, 2, 1))))
    println(palindrome((List(1, 2, 3, 2, 1))))
  }
}

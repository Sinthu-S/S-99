package Solutions

object P14 {

  def duplicate[T](l:List[T]):List[T] = l.foldLeft(List[T]()) {(r,h) => r:+h:+h}

  def main(args: Array[String]): Unit = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

}

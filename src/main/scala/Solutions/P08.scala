package Solutions

object P08 {

  def compress[T](l: List[T]): List[T] = {
    l.foldLeft(List[T]()) {(r, h) => if (r.isEmpty || r.last != h) r:+h else r}
  }

  def main(args: Array[String]): Unit = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}

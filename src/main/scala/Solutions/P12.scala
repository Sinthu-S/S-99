package Solutions

object P12 {

  def decode[T](l:List[(Int, T)]): List[T] = l.foldLeft(List[T]()) {(r,h) => r:::List.fill(h._1)(h._2)}

  def main(args: Array[String]): Unit = {
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }

}

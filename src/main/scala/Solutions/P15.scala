package Solutions

object P15 {

  def duplicateN[T](n:Int, l:List[T]):List[T] = l.foldLeft(List[T]()) {(r,h) => r:::List.fill(n)(h)}

  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
}

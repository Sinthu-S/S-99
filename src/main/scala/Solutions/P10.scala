package Solutions

import P09.pack

object P10 {

  def encode[T](l:List[T]):List[(Int, T)] = pack(l).map {e => (e.size, e.head)}

  def main(args: Array[String]): Unit = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}

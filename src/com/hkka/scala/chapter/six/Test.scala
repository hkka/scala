package com.hkka.scala.chapter.six

object Test extends App {
 try {
   val inValidRational = new Rational(1, 0)
 }
  catch {
    case e: Exception => println(e)
  }

  val oneHalf = new Rational(1,2)
  val twoThird = new Rational(2,3)

  println(oneHalf + twoThird)
  val sixtySixByFourtyTwo = new Rational(66,42)
  println(sixtySixByFourtyTwo)

  implicit def intToRational(x: Int) = new Rational(x)

  println(2 * new Rational(2,3))

  val list = List(1,2,3,4,5,6,7,8,9)

  val evenNumbersStar2: String = list.toStream.filter(e => e % 2 == 0).map(e => e * 2).mkString(" - ")
  println(evenNumbersStar2)

}

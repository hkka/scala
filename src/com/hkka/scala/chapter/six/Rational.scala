package com.hkka.scala.chapter.six

class Rational(n: Int, d: Int){
  require(d != 0)

  private val g = greatestCommonDivisor(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n,1)  // auxiliary constructor

  override def toString = numer + "/" + denom
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =
    new Rational(numer * i, denom)
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational =
    new Rational(numer, denom * i)
  //
  private def greatestCommonDivisor(a: Int, b: Int):Int =
    if (b == 0) a else greatestCommonDivisor(b, a % b)
}

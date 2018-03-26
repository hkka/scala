package com.hkka.scala

// In file Summer.scala
import ChecksumAccumulator.calculate

object Summer extends App {

    for (arg <- args)
      println(arg + ": " + calculate(arg))

    val acc = new ChecksumAccumulator
    !acc

  val salam = "salam"
  println(salam)
  val salamUpper = salam toUpperCase()
  println(salamUpper)

}

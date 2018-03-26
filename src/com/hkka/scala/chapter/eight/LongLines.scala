package com.hkka.scala.chapter.eight

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int) = {
    val source = Source.fromFile(filename)
    source getLines() foreach(processLine)

    // nested function , it accesses base function arguments
    def processLine(line: String) = if (line.length > width) println(filename + ": " + line.trim)
  }

  def main(args: Array[String]): Unit = processFile(".gitignore", 10)
}

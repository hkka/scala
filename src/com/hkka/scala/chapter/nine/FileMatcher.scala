package com.hkka.scala.chapter.nine

object FileMatcher {
  private def filesHere = new java.io.File(".\\src\\com\\hkka\\scala") listFiles
  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  private def filesMatching(matcher: String => Boolean) =
    filesHere filter(f => matcher(f.getName)) toList

  def main(args: Array[String]): Unit = {
    filesEnding(".scala") foreach println
    filesContaining("Hello") foreach println
  }

}

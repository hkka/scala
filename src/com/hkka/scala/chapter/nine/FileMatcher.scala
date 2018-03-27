package com.hkka.scala.chapter.nine

object FileMatcher {
  private def filesHere = new java.io.File(".\\src\\com\\hkka\\scala") listFiles
  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_ contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  private def filesMatching(matcher: String => Boolean) =
    filesHere filter(f => matcher(f.getName))

  private def safeNPEGet(o: String, getter: String => String) =
    if(o == Nil || o.isEmpty) "Null" else getter(o)

  private def currySafeNPE(s: String)(getter: String => String) =
    if(s == Nil || s.isEmpty) "Null" else getter(s)

  def main(args: Array[String]): Unit = {
    filesEnding(".scala") foreach println
    filesContaining("Hello") foreach println
    val printToString = (e: String) => e.toString
    println(safeNPEGet("", printToString(_)))
    println(safeNPEGet("Magenta", printToString(_)))
    val safeNpeResult = currySafeNPE("RICHAPI") { printToString }
    println("safeNpeResult :" + safeNpeResult)
  }

}

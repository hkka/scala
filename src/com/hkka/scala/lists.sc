import scala.collection.immutable.HashSet

val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)

val thrill = "Will" :: "fill" :: "until" :: Nil
thrill.count(s => s.length==4)
thrill map(s => s.toUpperCase)

//Tuples
val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)

val hashSet = HashSet("Tomatoes", "Chilies")
val newHashSet = hashSet + "Coriander"
println(hashSet)
println(newHashSet)

val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4))
def square(x: Int) = x * x
square(2)
def max(x: Int, y: Int) = if (x > y) x else y
max(3,5)

val tab = Array(1,2,3,4,5)
tab.foreach(println)
for(t <- tab)
  println(t)

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2)
  print(greetStrings(i))

(1).+(2)
1 + 2

val numNames2 = Array.apply("zero", "one", "two")
numNames2.length

print("chapi" toUpperCase)
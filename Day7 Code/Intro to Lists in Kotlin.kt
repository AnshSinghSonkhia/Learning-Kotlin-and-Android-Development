fun main() {
  val numbers: List<Int> = listOf(11, 22, 33, 44, 55, 66)			// Could also be written as...
    // val numbers = listOf(11, 22, 33, 44, 55, 66)
    // if the type of the variable can be guessed (or inferred) based on the value on the right hand side of the assignment operator (=)
     
    // Access elements of the list
  println("List: $numbers")
	println("Size: ${numbers.size}")
  println("First element: ${numbers[0]}")
  println("Second element: ${numbers[1]}")
	println("Last index: ${numbers.size - 1}")
	println("Last element: ${numbers[numbers.size - 1]}")
    
    //Kotlin also supports first() and last() operations on a list.
  println("First: ${numbers.first()}")
	println("Last: ${numbers.last()}")
    
    // Use the contains() method
  println("Contains 44? ${numbers.contains(44)}")
  println("Contains 77? ${numbers.contains(77)}")
}

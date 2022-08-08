// LISTS are Read-only

fun main() {
    val colors = listOf("green", "orange", "blue")
    /* colors.add("purple")
	colors[0] = "yellow" */
    
    //reversed() function returns a new list where the elements are in the reverse order
    //sorted() returns a new list where the elements are sorted in ascending order.
    println("Reversed list: ${colors.reversed()}")
	println("Original List: $colors")
    println("Sorted list: ${colors.sorted()}")
    
    println("")
    // Trying it on unsorted numbers
    val oddNumbers = listOf(5, 3, 7, 1)
	println("List: $oddNumbers")
	println("Sorted list: ${oddNumbers.sorted()}")
}

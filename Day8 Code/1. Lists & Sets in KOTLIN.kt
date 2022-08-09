// Collections in KOTLIN
/* 
 * A collection is a group of related items, like a list of words, or a set of employee records. The collection can have the items ordered or unordered, and the items can be unique or not. You've already learned about one type of collection, lists. Lists have an order to the items, but the items don't have to be unique.
*/

fun main() {
    
    // LISTS in KOTLIN
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)		//list
    println("list:   ${numbers}")
    
    			// Sorting the list of numbers
    println("sorted: ${numbers.sorted()}")
    println("Original List Was:  ${numbers}")
    
    println("------------------------------")
    
    // SETS in KOTLIN
    /* 
     * For example, there is a set of books that you've read. Reading a book multiple times doesn't change the fact it is in the set of books that you've read.
     * Order isn't significant for a set.
     */
     
     			//  convert the list to a set.
    val setOfNumbers = numbers.toSet()					// Set
	  println("set:    ${setOfNumbers}")					// Now, each element only appears once.
    
    			// Define a mutable set and an immutable set
    val set1 = setOf(1,2,3)
  	val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")
    			// Even though one is mutable and one isn't, and they have the items in a different order, they're considered equal because they contain exactly the same set of items.
    
    		// checking if a particular item is in the set
    println("Do Set contains 7: ${setOfNumbers.contains(7)}")
    
    if (setOfNumbers.contains(7)) {
        println("Yes, 7 is present")
    }
    else {
        println("7 is not in the set")
    }
}

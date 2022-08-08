// MutableList in Kotlin

fun main() {
    val entrees = mutableListOf<String>()
    // Or ou could have specified the data type of the variable upfront.
    val entrees2: MutableList<String> = mutableListOf()
    
    println("Entrees: $entrees")		//The output shows [] for an empty list.\
    
    // Adding Elements to a List
    println("Add noodles: ${entrees.add("noodles")}")   // This Prints TRUE. if added
	println("Entrees: $entrees")
    
    entrees2.add("Maggi")
    println("Entrees2: $entrees2")
    
    println("Add spaghetti: ${entrees.add("spaghetti")}")
	println("Entrees: $entrees")
    
    // An Immutable List
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    // Use addAll() to add all the items from the moreItems to entrees
    println("Add list: ${entrees.addAll(moreItems)}")
	println("Entrees: $entrees")
    
    //entrees.add(10)		// This will show error as it expects elements of type String & not Int
	
    // Remove elements from a list
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
	println("Entrees: $entrees")
    
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
	println("Entrees: $entrees")
    
    // Use removeAt() to remove the item at any index.
    println("Remove first element: ${entrees.removeAt(0)}")
	println("Entrees: $entrees")
    
    // If you want to clear the whole list, you can call clear().
    entrees.clear()
	println("Entrees: $entrees")
    
    // Check if the list i sempty or not?
    println("Empty? ${entrees.isEmpty()}")
   
}

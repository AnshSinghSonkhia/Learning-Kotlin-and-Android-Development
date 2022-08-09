fun main() {

    // MAPS in KOTLIN
    /*
     * A map is a set of key-value pairs designed to make it easy to look up a value given a particular key.
     * Keys are unique, and each key maps to exactly one value, but the values can have duplicates.
     * Values in a map can be strings, numbers, or objects—even another collection like a list or a set.
     * A map is useful when you have pairs of data, and you can identify each pair based on its key.
     * The key "maps to" the corresponding value.
     */
    
    val peopleAges = mutableMapOf<String, Int>(				// Creating a Mutable Map of String (key) to an Int (value)
        "Fred" to 30,				// key to value
		    "Ann" to 23					// key to value
    )
    println(peopleAges)
    
    			// use the put() function To add more entries to the map.package
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51				// shorthand notation to add entries
    
    println("After adding more -->  $peopleAges")
    
				// As this map is mutable, let's Update Something.
    peopleAges["Fred"] = 31
    println("After Updating Fred's Age -->  $peopleAges")
    
        
    println("---------------------------------")
    
    // forEach - It's similar to the for loop, but a little more compact.
    println("Using   forEach Method")
	peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println()
    
    println("---------------------------------")
    println("Using   map function")
    println(peopleAges.map { "${it.key} is ${it.value}" })
    
    println("---------------------------------")
    println("Using   map function with joinToString Method")
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    
    println("---------------------------------")
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)							// To filter names with fewer than 4 characters
  
}

// lambdas and Higher-Order Functions in KOTLIN

fun main() {
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))					// 15
    
    			// Or you could write as... 
    val triple2: (Int) -> Int = { it * 3 }
    println(triple2(5))					// 15
    			// because,  Kotlin implicitly uses the special identifier it for the parameter of a lambda with a single parameter.

// Higher-order functions
	/*
	 * This just means passing a function (in this case a lambda) to another function, or returning a function from another function.
	 * map, filter, and forEach functions are all examples of higher-order functions because they all took a function as a parameter.
	 * 
	 * Another Example of Higher-order functions is -------     sortedWith()
	 * 
	 */
     
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    				// sortedWith() 
	  println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
    
    /*
     * In this case, it returns the difference between the length of the first string and the length of the second string, 
     * which is an Int. That matches what is needed for sorting: if str1 is shorter than str2, 
     * it will return a value less than 0. If str1 and str2 are the same length, 
     * it will return 0. If str1 is longer than str2, it will return a value greater than 0. 
     * By doing a series of comparison between two Strings at a time, the sortedWith() function outputs a list 
     * where the names will be in order of increasing length.
     */
}

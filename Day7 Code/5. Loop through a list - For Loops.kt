fun main() {
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    
    for (name in names) {     // Meaning same as - for i in range  [Python]
    println(name)
	}
    
    // This is much easier than if you had to write this as a while loop!
    
    println("Let's PRINT the number of characters in that person's name.")
    for (name in names) {
    println("$name - Number of characters: ${name.length}")
	}
}


/*
 * WHAT MORE COULD YOU DO WITH FOR LOOPS -----
 * 
 
for (item in list) print(item) // Iterate over items in a list

for (item in 'b'..'g') print(item) // Range of characters in an alphabet

for (item in 1..5) print(item) // Range of numbers

for (item in 5 downTo 1) print(item) // Going backward

for (item in 3..6 step 2) print(item) // Prints: 35

*/

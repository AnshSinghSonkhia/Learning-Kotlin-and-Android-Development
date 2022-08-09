fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative", "Boy")
    
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
	  println("filteredWords are:   $filteredWords")
    
    val filterCWords = words.filter { it.startsWith("c", ignoreCase = true) }
    	  .shuffled()
        .take(1)
    println("filterCWords are:    $filterCWords")
}

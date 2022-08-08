fun main() {
    /**
     * Let's say you are organizing a party.
     * Create a list where each element represents the number of guests
     * that RSVP'd from each family. First family said 2 people would come
     * from their family. Second family said 4 of them would come, and so on.
     */

	val guestsPerFamily = listOf(2, 4, 1, 3)
    println("Total Families: ${guestsPerFamily.size}")
    
    var totalGuests = 0		// initialising it to 0
    var index = 0
    
    while (index < guestsPerFamily.size) {
    	totalGuests += guestsPerFamily[index]		//totalGuests = totalGuests + guestsPerFamily[index].
    	index++										// loop increment i.e., +1
	}   
    println("Total Guest Count: $totalGuests")
}

fun main() {
    val squareCabin = SquareCabin(6)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }
    
    val roundHut = RoundHut(3)
    with(roundHut) {
        println("\nRound Hut\n=========")
    	println("Material: ${buildingMaterial}")
    	println("Capacity: ${capacity}")
    	println("Has room? ${hasRoom()}")
    }
    
}

abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean {
    return residents < capacity
    }
}

class SquareCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

class RoundHut(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
}

class RoundTower(residents: Int) : RoundHut(residents) {
    /**
     *  By default, in Kotlin, classes are final and cannot be subclassed. You are only allowed to inherit from abstract classes or classes that are marked with the open keyword. Hence you need to mark the RoundHut class with the open keyword to allow it to be inherited from.package
     **/ 
    
    override val buildingMaterial = "Stone"
    override val capacity = 4
}

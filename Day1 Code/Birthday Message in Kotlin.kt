fun main() {
    val age = 5
    val name = "BokhlaDe"
    
    println("Happy Birthday, $name!")
    println("You are already $age years!")
    println("5 is the very best age to celebrate!")
    
    // \n means A Gap of one line.
    println("\n")
    println("Below is your Birthday Cake!   \n\n\n")
    
    // Now, I will Print a Cake
    
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    
    val ageDays = age * 365
    println("You saw the most powerful $ageDays Days! \n 	CONGRATULATIONS!!!")
    
    val border = "%"
    val TimesToRepeat = 14
    
    printBorder(border, TimesToRepeat)
    println("HAPPY BIRTHDAY $name!")
    printBorder(border, TimesToRepeat)
    
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    
}

fun printBorder(Border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {     		// To Repeat the below block 4 Times
        print(Border)
    }
    println()
    
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
          print(",")
    }    
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}

/* ##Use ${} to surround variables and calculations in the text of print statements. For example: ${age} where age is a variable.
Create a variable using the val keyword and a name. Once set, this value cannot be changed. Assign a value to a variable using the equal sign. Examples of values are text and numbers.
A String is text surrounded by quotes, such as "Hello".
An Int is a whole positive or negative number, such as 0, 23, or -1024.
You can pass one or more arguments into a function for the function to use, for example: fun printCakeBottom(age:Int, layers:Int) {}
Use a repeat() {} statement to repeat a set of instructions several times. For example: repeat (23) { print("%") } or repeat (layers) { print("@@@@@@@@@@") }
A loop is an instruction to repeat instructions multiple times. A repeat() statement is an example of a loop.
You can nest loops, that is, put loops within loops. For example, you can create a repeat() statement within a repeat() statement to print a symbol a number of times for a number of rows, like you did for the cake layers.
Summary of using function arguments: To use arguments with a function, you need to do three things:

Add the argument and type to the function definition: printBorder(border: String)
Use the argument inside the function: println(border)
Supply the argument when you call the function: printBorder(border) **/

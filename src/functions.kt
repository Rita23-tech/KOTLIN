fun main() {
    //STANDARD LIBRARY FUNCTIONS
    //these are functions that already exist

    var number = Math.sqrt(144.0)     //math is a library with different functions in it.
    println(number) //number is a variable, so its NOT IN QUOTATIONS, unless called inside a sentence

    day() //This is calling the function
    //student() this is for when you have specifically input values
    student("John", 17, "Android") // This is called parameters and arguments
    student("Ann", 21, "MIT")

}

//USER DEFINED FUNCTIONS. ->These are created and defined by programmers
/* in Kotlin to create a function, you MUST use a 'fun' key word,
then give it a name,
have the calibraces '{}', (to show where the code starts and ends)
Then define what it should do using println
After creating a function, you must always CALL IT.
NOW. in a Kotlin program, for something to get excecuted, wit Must be INSIDE the function MAIN

 */


fun day(){ //we are putting a bracket since functions MUST be followed with it for it to be a function
    println("Today is Wednesday") //here you define what the function should do


}

fun student(name: String, age: Int, course: String ){ //this is another function
    println("The student $name is $age years old and is doing $course this semester")
    //doing eg $name

}

//naming variables like this makes changing values inside it difficult
//to change that is to prompt user to input values
// or using parameters
//fun student (name: string, age: int, course: string)
/*
this is what was there before
  var name = "John"
    var age = 23
    var course = "Android Development"
 */

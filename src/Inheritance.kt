//function is also called method
//for animals that have same characteristics, we put whatis common between the 2 in one class
// classes are naturally private in kotlin
open class Animal{ //its like this normally ; 'class Animal{'
    //class giving out its members i called; a parent class, base class or superclass
    var isMamal = true
    var color = "white"

    fun eat(){
        println("Animal is eating")
    }

}

//for behaviors singular to each animal, you put it in its own class

//this is a child class
open class Cow : Animal(){ //cow is borrowing from animal

    fun sound(){
        println("Moo, Moo")
    }
}

class Sheep : Cow(){ //sheep borrowing from cow which has its characteristics + animal ones
    fun bleat(){
        println("meeee! meee!")
    }
}
//now we create the animals in OBJECTS. OBJECTS are created in 'main' function

fun main(){
    var mycow = Cow()
    mycow.sound()
}











fun main() {
    //ARITHMETIC OPERATORS
    //Used for simple categories, ie add subtract etc

    var num1 = 10
    var num2 = 5

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2) //modulus is the remainder after a division

    //COMPARISON OPERATORS
    var x = 80
    var y = 34

    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)
    println(x == y) //this is how you write equal to in programming
    println(x != y) // this is not equal to


    //ASSIGNMENT OPERATORS
    //this means taking a value and assigning it to a variable. uses '='
    var number = 100
    println(number) //output = 100

    //addition assignment. NB assignment ALWAYS COMES FIRST
    number += 2
    println(number) //output =102

    number -= 2
    println(number) //output = 100

    number /= 2
    println(number) //output = 50

    number %= 2
    println(number) //output = 0. It checks the number varible BEFORE hence the outputs

    //LOGICAL OPERATORS
    //there are 3, AND(&&), OR(||), NOT(!)

    println( 100 == 50 && 100 > 30 ) //and returns true if ALL conditions are true

    println( 100 == 50 || 100 > 30 ) //or returns true if any conditions are true

    println( ! (100 == 50 && 100 > 30) ) //not gives the OPPOSITE of the current operator out put. This case for or will now be false

    println( ! (100 == 50 || 100 > 30) )



}
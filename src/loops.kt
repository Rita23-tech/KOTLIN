fun main() {
    //WHILE LOOP
    //allows a condition to always get checked
    var number = 20
    //has 3 steps
    while (number <= 25){  // step 1. set your first value.
        //what should happen if a number is less than or equal to 20
        println("Number is $number") //step 2. set your condition
        number ++ // step 3. increment or decrement
        //since number will be increasing by 1 we put ++
        //if we dont put 'number ++' it will keep printing 20 infinitely
        //if condition is false, it won't print anything
    }

    //FOR LOOP. allows you to display numbers within a range

    for ( x in 20 .. 25){ //'..' is used to mean to
        print(x) //print displays a value in the same line
        println(x) //println displays output one after the other
    }

    //assignment; do while and break and continue statements

    //DO WHILE LOOP
    //Syntax for do while loop is 'do'
    /* steps are
    do{
    //code sequence}
    (after code sequence you write the while keyword)
    while(text expression)
     */
    //The code inside the body of DO is  executed ONCE without checking the TEST EXPRESSION
    //Then the test expression is checked. If text expression is true,
    //code inside the body of the loops are excecuted once again
    //The loop goes on and on until text expression becomes false. then the loop TERMINATES

    var y = 1
    do {
        println("your number is $y")
        y++
    } while (y <= 10)

    //this is a basic example.


    //BREAK AND CONTINUE STATEMENTS
    //These are control tools that allow you to manage how your loops execute
    //helps you exit a loop early or skip specific iterations













}
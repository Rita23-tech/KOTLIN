fun main() {
    //BREAK AND CONTINUE STATEMENTS
    //These are control tools that allow you to manage how your loops execute
    //helps you exit a loop early or skip specific iterations without processing everything

    //BREAK STATEMENT
    //Break STOPS loop or any process after it
    for (i in 1..100) {
        if (i == 5) break //this is so when i equals 5, the loop stops
        println(i) //the output will be 1, 2, 3, 4. Everything after the 'break' statement stops
    }

    //CONTINUE STATEMENT
    //In continue, instead of exiting the loop, it SKIPS the current iteration and moves to the next one

    for (x in 1..15) {
        if (x == 5) continue //skips 5
        println(x) //output is numbers 1 -> except 5
    }


    // BREAK = CAN BE USED TO FIND AN ELEMENT AND STOP EARLY
    var numbers = listOf(10, 20, 30, 40, 50)

    for (num in numbers) {
        if (num == 30) {
            println("found $num")
            break //stop/exits the loop
        }
    }

    // CONTINUE = used in filtering
    var scores = listOf(15, -1, -2, 0, 38, 25)
    for (score in scores ) {
        if (score <= 0) continue //when a score is less than or equal to 0, those invalid entries are SKIPPED
        println("valid: $score")

    }

    //LABELS WITH NESTED LOOPS
    //When working with nested loops, you might want to break out of an outer loop from inside the loop
    outerloop@ for (z in 1 .. 5) {
        for (a in 1 .. 5) {
            if (a == 2) break@outerloop
            println("z = $z, a = $a")
        }
    }

    outerloop@ for (b in 1 .. 5) {
        for (c in 1 .. 5) {
            if (c == 2) continue@outerloop
            println("b = $b, c = $c")
        }
    }













}
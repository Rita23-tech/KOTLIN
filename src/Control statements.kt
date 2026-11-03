fun main() {
    var first = 56
    var second = 78
    var third = 45

    if (first > second && first > third){
        println("$first is the largest") //this is string entapolation
    }

    else if (second > third && second > third){
        println("$second is the largest")
        //println(second + "is the largest number") cant do this oz second is an integer
    }
    else{
        println("$third is the largest")
    }
}
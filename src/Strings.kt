fun main() {

    var course = "SOFTWARE DEVELOPMENT"
    var school = "eMobilis"

    //When you have multiple values and you want to print a single letter, you use the index position
    //Index position starts from 0
    println(course[0]) //index position

    //Determining SIZE of a string,
    println(course.length) //counts the space too
    println(school.length)

    //STRING CONCATENATION. Concept of joining strings
    println(school + " "+ course)
    println(school + "is a really big institution") //for string only not integers

    //STRING ENTAPOLATION
    //here EVERYTHING is passed in double quotes
    //varriables are accompanied by a dollar sign
    println("I study at $school. I am currently studying $course")


}
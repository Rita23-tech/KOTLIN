
//poly means many
//definition is, same methods across different classes but what they are doing is different
//lets talk about the shapes, circle and rectangle


open class Shape{ //opening the class so it can be inheritted
    open fun draw(){ //also open the method so it can be inherited
        println("Drawing a shape")
    }
}

class Rectangle:Shape(){
    override fun draw(){ //since methods are same, we override the previous one
        println("Drawing a rectangle")
    }
}

class circle:Shape(){
    override fun draw (){
        println("Drawing a circle")
    }
}

fun main() {
    var rect =Rectangle()
    rect.draw()

    var mycircle = circle()
    mycircle.draw()
}
















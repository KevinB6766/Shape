fun main(args: Array<String>) {
    val triangle : Shape = Triangle()
    val equilateralTriangle: Shape = EquilateralTriangle()
    val square : Shape = Square()
    val circle : Shape = Circle()

    print("Enter the circle's radius:")
    (circle as Circle).setDimensions(readln().toInt())
    println("Shape Name: ${circle.name}")
    println("Dimensions(s):")
    circle.printDimensions()
    print("Area: ${circle.getArea()}\n")

    print("Enter the length of the equilateral triangle:")
    (equilateralTriangle as EquilateralTriangle).setDimensions(readln().toInt())
    println("Shape Name: ${equilateralTriangle.name}")
    println("Dimension(s):")
    equilateralTriangle.printDimensions()
    print("Area: ${equilateralTriangle.getArea()}\n")

    println("Enter the three lengths of the triangle separated by spaces:")
    val input = readLine() // Reads input from the user
    val params = input?.split(" ")?.map { it.toInt() } // Split input by space and convert from String to Int

    // Ensure there are exactly 3 values, then call the function
    if (params != null && params.size == 3) {
        (triangle as Triangle).setDimensions(params[0], params[1], params[2])
    }
    else {
        println("Please enter exactly three values!")
    }
    println("Shape Name: ${triangle.name}")
    println("Dimension(s):")
    triangle.printDimensions()
    print("Area: ${triangle.getArea()}\n")

    println("Enter length and height separated by a space:")
    val input2 = readLine() // Reads input from the user
    val params2 = input2?.split(" ")?.map { it.toInt() } // Split input by space and convert from String to Int

    // Ensure there are exactly 3 values, then call the function
    if (params2 != null && params2.size == 2) {
        (square as Square).setDimensions(params2[0], params2[1])
    }
    else {
        println("Please enter exactly two values!")
    }
    println("Shape Name: ${square.name}")
    println("Dimension(s):")
    square.printDimensions()
    print("Area: ${square.getArea()}")

}
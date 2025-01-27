class Circle : Shape ("Circle") {
    private var radius: Int = 0

    override fun printDimensions() {
        println("Radius: $radius")
    }

    fun setDimensions(radius: Int) {
        this.radius = radius
    }

    override fun getArea():Double {
        return Math.PI * radius * radius
    }
}
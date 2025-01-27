class Square(_name: String =  "Square") : Shape(_name) {

    private var length: Int = 0
    private var height: Int = 0

    override fun printDimensions() {
        println("Length: $length\nHeight: $height")
    }

    fun setDimensions(length: Int, height: Int) {
        this.length = length
        this.height = height
    }
    override fun getArea(): Double {
        return (length * height).toDouble()
    }
}
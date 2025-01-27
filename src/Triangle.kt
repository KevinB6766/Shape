import kotlin.math.sqrt

open class Triangle(_name: String = "Triangle") : Shape(_name) {

    private var lengthA: Int = 0
    private var lengthB: Int = 0
    private var lengthC: Int = 0

    override fun printDimensions() {
        println("Length A: $lengthA\nLength B: $lengthB\nLength C: $lengthC")
    }

    fun setDimensions (lengthA: Int, lengthB: Int, lengthC: Int) {
        this.lengthA = lengthA
        this.lengthB = lengthB
        this.lengthC = lengthC
    }
    override fun getArea(): Double {
        val s = (lengthA + lengthB + lengthC).toDouble() * 0.5
        return sqrt(s * (s - lengthA) * (s - lengthB) * (s - lengthC))
    }
}

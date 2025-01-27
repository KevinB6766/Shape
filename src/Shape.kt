abstract class Shape (_name: String) : Dimensionable {
    val name = _name

    open fun getArea(): Double {
        return 0.0
    }
}
/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val X: Double, val Y: Double) {
    constructor(X: Int, Y: Int): this(X.toDouble(), Y.toDouble()) //конструктор, т.к. котлин не понимает, что 34 - это дабл))0)
    open val area: Double = 0.0
    open fun display() {
        // Формат вывода – S = ... , X = ... , Y = ...
        println("Point: S: $area, X = $X, Y = $Y")
    }
}

class Square(x: Double, y: Double, val side: Double) : Point(x, y) {
    constructor(x: Int, y: Int, side: Int) : this(x.toDouble(), y.toDouble(), side.toDouble())
    override val area: Double
        get() = side * side
    override fun display() {
        println("Square: S = $area, X = $X, Y = $Y")
    }
}

class Circle(x: Double, y: Double, val r: Double) : Point(x, y) {
    constructor(x: Int, y: Int, radius: Int) : this(x.toDouble(), y.toDouble(), radius.toDouble())
    override val area: Double
        get() = Math.PI * r * r
    override fun display() {
        println("Circle: S = $area, X = $X, Y = $Y")
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val p = Point(34, 56)
    val c = Circle(46, 34, 7)
    val s = Square(46, 34, 8)
    p.display()
    c.display()
    s.display()
}
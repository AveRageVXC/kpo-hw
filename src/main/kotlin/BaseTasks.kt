import kotlin.math.sqrt

/**
    Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    println("Пожалуйста, введите свое ФИО")
    val surname = readln()
    val name = readln()
    val fathersname = readln()
    print("Фамилия: $surname \nИмя: $name \nОтчество: $fathersname")
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val D = b * b - 4 * a * c
    val x1 = (-b + sqrt(D)) / 2 / a
    val x2 = (-b - sqrt(D)) / 2 / a
    return x1 to x2
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (s in 111..999){
        if (s % 111 == 0){
            println(s)
        }
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
//    askForInput()

//    val roots = quadraticRoots(-5.0, 4.0, 3.0)
//    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}
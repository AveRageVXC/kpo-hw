
/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    println("Введите длину массива")
    val n = readln().toInt()
    val array = Array(n) {0}
    println("Введите элементы массива")
    for (i in 1..n){
        val x = readln().toInt()
        array[i - 1] = x;
    }
    print("Массив: ")
    println(array.joinToString(separator = " "))
    return array
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    println("Отсортированный массив: " + arr.joinToString(separator = " "))
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()

    sortArrayDesc(arr)
}


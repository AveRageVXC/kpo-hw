/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: MutableList<String>): List<String> {
    val n = array.size
    for (i in n - 1 downTo 0){
        val ind = array.indexOf(array[i])
        if (ind != i) {
            array[i] = "blahblah";
        }
    }
    return array
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val set = text.split(" ").toSet()
    return set.size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "we are we are are downs"
    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    println(replaceElements(text.split(" ").toMutableList()).joinToString())
}
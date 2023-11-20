/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val cnt = mutableSetOf<String>()
    val result = mutableListOf<String>()
    for (element in array) {
        if (cnt.contains(element)) {
            result.add("blahblah")
        } else {
            result.add(element)
            cnt.add(element)
        }
    }
    return result
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val words = text.split(" ")
    val uniqueWords = mutableSetOf<String>()
    for (word in words) {
        uniqueWords.add(word)
    }
    return uniqueWords.size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
//    val text = "435 4 4 4"
//    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
//    replaceElements()
}
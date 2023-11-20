import java.util.*

/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    print("Введите количество элементов массива N: ")
    val n = readLine()?.toIntOrNull() ?: 0

    val array = Array(n) { 0 }
    println("Введите значения элементов массива:")
    for (i in array.indices) {
        array[i] = readLine()?.toIntOrNull() ?: 0
    }
    for (element in array) {
        print("$element ")
    }
    println()
    return array
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    for (element in arr) {
        print("$element ")
    }
    println()
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
//    val arr = makeArray()

//    sortArrayDesc(arr)
}


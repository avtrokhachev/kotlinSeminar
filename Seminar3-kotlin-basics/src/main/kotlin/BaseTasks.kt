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
    print("Введите вашу фамилию: ")
    val lastName = readLine()
    print("Введите ваше имя: ")
    val firstName = readLine()
    print("Введите ваше отчество: ")
    val middleName = readLine()

    println("\nФамилия: $lastName\nИмя: $firstName\nОтчество: $middleName\n")
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double?, Double?> {
    val discriminant = b * b - 4 * a * c

    return if (discriminant >= 0) {
        val root1: Double? = (-b + sqrt(discriminant)) / (2 * a)
        val root2: Double? = (-b - sqrt(discriminant)) / (2 * a)
        root1 to root2
    } else {
        null to null
    }
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (i in 1..9) {
        println(i * 111)
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
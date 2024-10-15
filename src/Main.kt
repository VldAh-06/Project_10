class Project_10 {
    fun printNumbers(n: Int): List<Int> {
        if (n <= 0) {
            return emptyList()
        }
        return (n downTo 1).toList()
    }

    fun pyramid(n: Int) {
        for (i in 1..n) {
            val spaces = " ".repeat(n - i)
            val hashes = "#".repeat(2 * i - 1)
            println("$spaces$hashes$spaces")
        }
    }

    fun main() {
        // Примеры использования функций
        println(printNumbers(0)) // []
        println(printNumbers(2)) // [2, 1]
        println(printNumbers(5)) // [5, 4, 3, 2, 1]

        println("")

        pyramid(1)
        // Вывод:
        // '#'

        println("")

        pyramid(2)
        // Вывод:
        // ' # '
        // '###'

        println("")

        pyramid(3)
        // Вывод:
        // '  #  '
        // ' ### '
        // '#####'
    }
}
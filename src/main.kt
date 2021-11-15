import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter two values: ")

    val first = reader.nextDouble()
    val second = reader.nextDouble()

    print("Enter operator (+, -, *, /): ")
    val operator = reader.next()[0]

    val result: Double

    when (operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        else -> {
            System.out.printf("Error! operator is not invalid")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result)
}
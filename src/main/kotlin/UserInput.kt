import java.util.Scanner

class UserInput {

    private val scanner = Scanner(System.`in`)

    fun userInput() : String {
        val text = scanner.nextLine()
        return text
    }

    fun closeScanner() {
        scanner.close()
    }
}
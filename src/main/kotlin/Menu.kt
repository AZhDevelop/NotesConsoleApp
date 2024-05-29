class Menu<T>(private val header: ConstantValues) {

    fun render(elements: MutableList<T>) {
        when(header) {
            ConstantValues.ARCHIVE_LIST -> {
                println("Список архивов: ")
                println("0. Создать архив")
                elements.forEachIndexed { i, el -> println("${i + 1}. $el") }
                println("${elements.size + 1}. Выход из программы")
            }
            ConstantValues.NOTES_LIST -> {
                println("Список заметок: ")
                println("0. Создать заметку")
                elements.forEachIndexed { i, el -> println("${i + 1}. $el") }
                println("${elements.size + 1}. Назад")
            }
        }
    }

    fun addElement(elements: MutableList<T>, name: T) {
        elements.add(name)
        when(header) {
            ConstantValues.ARCHIVE_LIST -> println("Архив \"$name\" успешно добавлен")
            ConstantValues.NOTES_LIST -> println("Заметка \"$name\" успешно добавлена")
        }
    }

    fun createElement() : String {
        when(header) {
            ConstantValues.ARCHIVE_LIST -> {
                print("Введите название архива: ")
                return UserInput().userInput()
            }
            ConstantValues.NOTES_LIST -> {
                print("Введите название заметки: ")
                return UserInput().userInput()
            }
        }
    }

}
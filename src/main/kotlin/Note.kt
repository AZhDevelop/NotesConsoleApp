class Note(private val name: String) {

    lateinit var text: String

    override fun toString(): String {
        return name
    }

}
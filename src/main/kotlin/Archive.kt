class Archive(private val name: String) {

    val notesList: MutableList<Note> = mutableListOf()

    override fun toString(): String {
        return name
    }

}
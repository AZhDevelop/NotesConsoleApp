fun main() {

    val archiveList: MutableList<Archive> = mutableListOf()
    val archiveMenu = Menu<Archive>(header = ConstantValues.ARCHIVE_LIST)
    val notesMenu = Menu<Note>(header = ConstantValues.NOTES_LIST)

    archiveMenu.render(archiveList)
    archiveMenu.addElement(archiveList, Archive(archiveMenu.createElement()))
    archiveMenu.render(archiveList)

    notesMenu.render(archiveList[0].notesList)
    notesMenu.addElement(archiveList[0].notesList, Note(notesMenu.createElement()))
    notesMenu.render(archiveList[0].notesList)

    UserInput().closeScanner()
}
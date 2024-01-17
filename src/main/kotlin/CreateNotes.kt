class CreateNotes {
    fun create(archive: Archive) {
        var newName: String? = null
        println("Введите имя новой заметки: ")
        newName = inputStr()
        archive.notes.add(Note(newName,""))
        println("Заметка $newName успешно создана")
    }
}
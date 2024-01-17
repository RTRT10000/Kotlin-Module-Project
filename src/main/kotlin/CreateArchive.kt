class CreateArchive {

    fun create() {
        var newName: String? = null
        var notes: MutableList<Note> = ArrayList()
        println("Введите имя нового архива: ")
        newName = inputStr()
        archives.add(Archive(newName, notes))
        println("Архив $newName успешно создан")
    }

}
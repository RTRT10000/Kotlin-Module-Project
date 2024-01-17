class EditNote {
    fun listItems(archive: Archive, note: Note): List<MenuItem> {

        var menu: MutableList<MenuItem> = ArrayList()
        menu.add(MenuItem("Добавить текст к заметке",
            {
                editNote.create(note)
                printMenu(editNote.header(note), editNote.listItems(archive, note))
            }
        ))
        menu.add(MenuItem("Показать заметку",
            {
                editNote.show(note)
                printMenu(editNote.header(note), editNote.listItems(archive, note))
            }
        ))
        menu.add(
            MenuItem(
                "Выход",
                { printMenu(menuChooseNote.header(archive), menuChooseNote.listItems(archive)) })
        )

        return menu
    }

    fun header(note: Note) = "Заметка (${note.name}):"

    fun create(note: Note) {
        var newTxt: String? = null
        println("Введите текст  заметки: ")
        newTxt = inputStr()
        if (note.txt.length > 0) {
            note.txt = note.txt + "\n"
            note.txt = note.txt + newTxt
        } else {
            note.txt = newTxt
        }

    }

    fun show(note: Note) {
        println("Текст заметки ${note.name}:")
        println(note.txt)
    }
}
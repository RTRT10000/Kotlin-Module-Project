class MenuChooseNote {

    fun listItems(archive: Archive): List<MenuItem> {

        var menu: MutableList<MenuItem> = ArrayList()
        menu.add(MenuItem("Cоздать заметку",
            {createNotes.create(archive)
             printMenu(menuChooseNote.header(archive), menuChooseNote.listItems(archive))
            }
        ))
        if (archive.notes.size > 0) {
            for (note in archive.notes) {
                menu.add(MenuItem("${note.name}", {printMenu(editNote.header(note), editNote.listItems(archive, note))}))
            }
        }
        menu.add(MenuItem("Выход", {printMenu(menuChooseArchive.header, menuChooseArchive.listItems())}))

        return menu
    }

    fun header(archive: Archive) = "Заметки (архива ${archive.name}):"
}
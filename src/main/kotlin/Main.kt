fun main(args: Array<String>) {


    while (true) {
        printMenu(menuChooseArchive.header, menuChooseArchive.listItems())

        if (menuChooseArchive.exitFlag) {
           break
        }
    }


}

var archives: MutableList<Archive> = ArrayList()

val menuChooseArchive = MenuChooseArchive()
val menuChooseNote = MenuChooseNote()
val createArchive = CreateArchive()
val createNotes = CreateNotes()
val editNote = EditNote()
data class Note(var name: String, var txt: String)
data class Archive(var name: String, var notes: MutableList<Note>)

class MenuItem(val label: String, val action: () -> Unit)


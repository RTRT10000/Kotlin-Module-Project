class MenuChooseArchive  {
   val header = "Архивы:"
   var exitFlag: Boolean = false

    fun listItems(): List<MenuItem> {

       var menu: MutableList<MenuItem> = ArrayList()
       menu.add(MenuItem("Cоздать архив", {createArchive.create()}))
       if (archives.size > 0) {
           for (archive in archives) {
               menu.add(MenuItem("${archive.name}", {printMenu(menuChooseNote.header(archive), menuChooseNote.listItems(archive))}))
           }
        }
        menu.add(MenuItem("Выход", {menuChooseArchive.exitFlag = true}))

       return menu
    }
}




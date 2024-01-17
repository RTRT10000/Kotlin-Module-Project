import java.util.Scanner

fun printMenu(header: String, menuList: List<MenuItem>) {

    val scanner: Scanner = Scanner(System.`in`)
    val maxVal = menuList.size-1
    var inp: Int = -1


    while (true) {
        println(header)
        menuList.forEachIndexed { index, menuItem -> println("$index. ${menuItem.label}")  }
        if (!scanner.hasNextInt()) {
            println("Для выбора пункта меню необходимо ввести число")
            scanner.nextLine()
            continue
        } else {
            inp = scanner.nextInt()
            if (inp in 0..maxVal) {
                menuList[inp].action()
                break
            } else {
                println("Введено не корректное число. Соответствующего пункта меню нет. Пожалуйста, повторите ввод")
                scanner.nextLine()
                continue
            }
        }
    }

}




fun inputStr(): String {
    val scanner: Scanner = Scanner(System.`in`)
    var res: String? = null
    while (true) {
        res = scanner.nextLine()
        if (res.length > 1) {
            break
        } else {
            println("Пустой ввод не допустим")
        }
   }
   return res!!
}
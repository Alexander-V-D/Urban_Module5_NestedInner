fun main() {

    //Задача 1
    println("Ответ к задаче 1:")
    val human = Human()
    human.Legs().move().move().stop().stop()
    human.Hands().take("предмет").drop().drop()
    human.Head().thinkAbout("работа").sleep().thinkAbout("интересный сон").sleep().wakeUp().wakeUp()

    //Задача 2
    val stringArray = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println("Ответ к задаче 2:")
    while (true) {
        println("Введите символы:")
        val stroke = readln()
        stringArray.forEach { if (it.contains(stroke)) println(it) }
        println("Продолжить? 1 - Да, 2 - Нет")
        if (readln() == "2") break
    }

    //Задача 3
    val numbers = arrayOf(1, 2, 3, 0, 1, 2, 3, 0, 4, 5, 6)
    var enableCounter = false
    var count = 0
    numbers.forEach {
        if (it == 0) {
            enableCounter = !enableCounter
        }
        if (enableCounter && it != 0) count++
    }
    println("Ответ к задаче 3: $count")
}
class Human {
    private var isMoving = false
    private var itemInHands = ""
    private var isSleeping = false

    inner class Legs {
        fun move(): Legs {
            if (!isMoving) println("Человек идет") else println("Человек продолжает идти")
            isMoving = true
            return this
        }
        fun stop(): Legs {
            if (isMoving) println("Человек остановился") else println("Человек продолжает стоять")
            isMoving = false
            return this
        }
    }

    inner class Hands {
        fun take(item: String): Hands {
            if (itemInHands.isEmpty())  {
                println("Человек взял $item")
                itemInHands = item
            } else println("Не получится взять предмет, в руках уже есть $item")
            return this
        }
        fun drop(): Hands {
            if (itemInHands.isNotEmpty()) {
                println("Человек положил $itemInHands")
            } else println("Человеку нечего положить")
            itemInHands = ""
            return this
        }
    }

    inner class Head {
        fun thinkAbout(thing: String): Head {
            if (!isSleeping) println("У человека в мыслях $thing") else println("Человеку снится $thing")
            return this
        }
        fun sleep(): Head {
            if (!isSleeping) println("Человек спит") else println("Человек спит дальше")
            isSleeping = true
            return this
        }
        fun wakeUp(): Head {
            if (isSleeping) println("Человек проснулся") else println("Человек уже не спит")
            isSleeping = false
            return this
        }
    }
}
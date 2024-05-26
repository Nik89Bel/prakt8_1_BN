class Insects(var name: String, var type: String, var speed: Double, var maxSpeed: Double, var minSpeed: Double, var srSpeed: Double, var okr: String, var eda: String, var ves: Double, var massa: Double, var srObit: String) {
    fun Input(Insect: Insects) {
        try {
            print("Введите название насекомого (с большой буквы): ")
            Insect.name = readLine()!!.toString()
            print("Введите скорость передвежения насекомого: ")
            Insect.speed = readLine()!!.toDouble()
            print("Введите Максимальную скорость передвежения насекомого: ")
            Insect.maxSpeed = readLine()!!.toDouble()
            print("Введите Минимальную скорость передвежения насекомого: ")
            Insect.minSpeed = readLine()!!.toDouble()
            if (Insect.speed > 0 && Insect.maxSpeed > 0 && Insect.minSpeed > 0) {
                print("Введите окрас насекомого: ")
                Insect.okr = readLine()!!.toString()
                print("Введите используемую пищу насекомого: ")
                Insect.eda = readLine()!!.toString()
                print("Введите вес насекомого: ")
                Insect.ves = readLine()!!.toDouble()
                if (Insect.ves > 0) {
                    print("Введите среду обитания: ")
                    Insect.srObit = readLine()!!.toString()
                }
                else
                    println("Не правильный ввод веса")
            }
            else
                println("Не правильный ввод скорости")
        } catch (e: Exception) {
            println("Не правильный ввод")
        }
    }
    fun RasType(Insect: Insects){
        when (Insect.name){
            "Жук", "Таракан", "Навозник","Стрекоза", "Богомол", "Вошь", "Поденка", "Паук" -> Insect.type = "С не полным превращением"
            "Блоха", "Бабочка", "Муха", "Оса", "Пчела", "Шершень", "Комар", "Божья коровка" -> Insect.type = "С полным превращением"
            else -> Insect.type = "Скорее всего такого насекомого нет в нашей книги, либо вы неправильно ввели название"
        }
    }
    fun RasMass(Insect: Insects){
        Insect.massa = Insect.ves / 9.8
    }
    fun RasSrSpeed(Insect: Insects){
        Insect.srSpeed = (Insect.maxSpeed + Insect.minSpeed) / 2.0
    }
    fun GetInfo(Insect: Insects){
        if (Insect.speed > 0 && Insect.maxSpeed > 0 && Insect.minSpeed > 0) {
            println("Характеристики насекомого: ")
            println(
                "----------------------------------------------" +
                        "\nНазвание насекомого: " + Insect.name +
                        "\nТип насекомого: " + Insect.type +
                        "\nСкорость насекомого: " + Insect.speed +
                        "\nСредняя скорость насекомого: " + Insect.srSpeed +
                        "\nОкрас насекомого: " + Insect.okr +
                        "\nПища насекомого: " + Insect.eda +
                        "\nВес насекомого: " + Insect.ves +
                        "\nМасса насекомого: " + Insect.massa +
                        "\nСреда обитания насекомого: " + Insect.srObit +
                        "\n----------------------------------------------")
        }
    }
}

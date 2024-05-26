class Autos(var marka: String, var powerls: Int, var powervt: Int, var prise: Double, var sale: Double, var prise1: Double, var maxSpeed: Double, var minSpeed: Double, var srSpeed: Double) {
    fun Input(Auto: Autos) {
        try {
            print("Введите марку машины: ")
            Auto.marka = readLine()!!.toString()
            print("Введите мощность машины (в лошадинных силах): ")
            Auto.powerls = readLine()!!.toInt()
            if (powerls > 0){
                print("Введите цену машины: ")
                Auto.prise = readLine()!!.toDouble()
                print("Введите скидку на машину (в сотых): ")
                Auto.sale = readLine()!!.toDouble()
                if (prise > 0 && sale > 0){
                    print("Введите максимальную скорость машины: ")
                    Auto.maxSpeed = readLine()!!.toDouble()
                    print("Введите обычную скорость машины: ")
                    Auto.minSpeed = readLine()!!.toDouble()
                    if (Auto.maxSpeed < 0 && Auto.minSpeed < 0) {
                        println("Не правильный ввод скорости")
                    }
                }
                else
                    println("Не правильный ввод цены и скидки")
            }
            else
                println("Не правильный ввод мощности")
        } catch (e: Exception) {
            println("Не правильный ввод")
        }
    }
    fun RasPower(Auto: Autos){
        Auto.powervt = Auto.powerls * 736
    }
    fun RasPrise(Auto: Autos){
        Auto.prise1 = Auto.prise - Auto.prise * Auto.sale
    }
    fun RasSrSpeed(Auto: Autos){
        Auto.srSpeed = (Auto.maxSpeed + Auto.minSpeed) / 2.0
    }
    fun GetInfo(Auto: Autos){
        if (Auto.srSpeed > 0 && Auto.maxSpeed > 0 && Auto.minSpeed > 0 && Auto.prise > 0 && Auto.sale > 0 && Auto.powerls > 0) {
            println("Характеристики машины: ")
            println(
                "----------------------------------------------" +
                        "\nМарка машины: " + Auto.marka +
                        "\nЦена машины без скидки: " + Auto.prise +
                        "\nЦена машины со скидкой: " + Auto.prise1 +
                        "\nМощность в Л.С. машины: " + Auto.powerls +
                        "\nМощность в Вт машины: " + Auto.powervt +
                        "\nСредняя скорость машины: " + Auto.srSpeed +
                        "\n----------------------------------------------")
        }
    }
}
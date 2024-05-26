fun main(){
    var auto1 = Autos(marka = "", powerls = 0, powervt = 0, prise = 0.0, sale = 0.0, prise1 = 0.0, maxSpeed = 0.0, minSpeed = 0.0, srSpeed = 0.0)
    auto1.Input(auto1)
    auto1.RasPower(auto1)
    auto1.RasSrSpeed(auto1)
    auto1.RasPrise(auto1)
    auto1.GetInfo(auto1)
}
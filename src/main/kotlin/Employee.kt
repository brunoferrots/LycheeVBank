open class Employee (
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    open fun getBonus(): Double = salary * 0.1

}
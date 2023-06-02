open class Employee (
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    open val bonus: Double
        get() {
            return salary * 0.1
        }

}
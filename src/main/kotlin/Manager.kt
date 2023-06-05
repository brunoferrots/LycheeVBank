class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String

) : Employee(
    name = name,
    cpf = cpf,
    salary = salary)  {

    override fun getBonus(): Double = super.getBonus() + salary

    fun authentication(password: String): Boolean = this.password == password

}
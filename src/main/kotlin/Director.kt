class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: String

) : Employee(
    name = name,
    cpf = cpf,
    salary = salary)  {

    override val bonus: Double = salary * 0.3

    fun authentication(password: String): Boolean = this.password == password
    
}
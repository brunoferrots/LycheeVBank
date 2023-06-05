class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: String,
    val plr: Double

) : Employee(
    name = name,
    cpf = cpf,
    salary = salary)  {

    override fun getBonus(): Double = super.getBonus() + salary + plr;

    fun authentication(password: String): Boolean = this.password == password
    
}
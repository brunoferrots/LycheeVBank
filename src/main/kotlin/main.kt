fun main() {
    val employeeBruno = Employee("Bruno", "90809", 5000.0)

    println("Employee name: ${employeeBruno.name} \n" +
            "CPF: ${employeeBruno.cpf} \n" +
            "Salary: ${employeeBruno.salary} \n" +
            "Bonus: ${employeeBruno.bonus}")

    val manageFran = Manager(name = "Fran", cpf = "456.789", salary = 10000.0, password = "1234")

    println("""
        Employee name: ${manageFran.name}
        CPF: ${manageFran.cpf}
        Salary: ${manageFran.salary}
        Bonus: ${manageFran.bonus}
        Authentication: ${manageFran.authentication("1234")}
    """)

    val directorEren = Director(name = "Eren", cpf = "789.456", salary = 15000.0, password = "7890")

    println("""
        Employee name: ${directorEren.name}
        CPF: ${directorEren.cpf}
        Salary: ${directorEren.salary}
        Bonus: ${directorEren.bonus}
        Authentication: ${directorEren.authentication("7890")}
    """)
}
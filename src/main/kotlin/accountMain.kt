fun accountMain() {
    val brunoAccount = Account(owner = "Bruno Iron", number = 12356)
    brunoAccount.deposit(1000.0)

    val maryAccount = Account(owner = "Mary Grace", number = 7676)

    brunoAccount.transfer(1500.0, maryAccount)

    println("Account ${brunoAccount.owner} show Balance ${brunoAccount.balance}")
}
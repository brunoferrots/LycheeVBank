class Account(
    val owner: String,
    val number: Int
) {
    var balance = 0.0
        private set

    fun deposit(value: Double) {
        this.balance += value
    }

    fun withdraw(value: Double) {
        if (value < balance) {
            balance -= value
        } else {
            println("Insufficient balance")
        }
    }

    fun transfer(value: Double, account: Account) {
        this.withdraw(value)
        account.deposit(value)
    }

}
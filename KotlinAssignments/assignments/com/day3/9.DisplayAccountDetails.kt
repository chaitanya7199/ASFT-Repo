package com.day3

/*
Create a class called Account with acctid,Acct_type,name with primary constructor.
Create 5 instance to Account class to display each ones details.
*/

fun main() {
    val account1 = Account(1001, "Current", "Sai")
    val account2 = Account(1002, "Savings", "Sai")
    val account3 = Account(1003, "Current", "Preetham")
    val account4 = Account(1004, "Current", "Ram")
    val account5 = Account(1005, "Savings", "Kishore")
    println("" + account1 + "\n" + account2 + "\n" + account3 + "\n" + account4 + "\n" + account5)
}

class Account(accountId: Int, accountType: String, accountHolderName: String) {
    var accountId: Int = 0
    var accountType: String = ""
    var accountHolderName: String = ""

    init {
        this.accountId = accountId
        this.accountType = accountType
        this.accountHolderName = accountHolderName
    }

    override fun toString(): String {
        return "Account(accountId=$accountId, accountType='$accountType', accountHolderName='$accountHolderName')"
    }

}
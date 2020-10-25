package com.day3

/*
Create a class called Account with acctid,Acct_type,name with secondary constructor.
Create 5 instance to Account class to display each ones details.
*/

fun main() {
    val account1 = Account1(1001, "Current", "Sai")
    val account2 = Account1(1002, "Savings", "Sai")
    val account3 = Account1(1003, "Current", "Preetham")
    val account4 = Account1(1004, "Current", "Ram")
    val account5 = Account1(1005, "Savings", "Kishore")
    println("" + account1 + "\n" + account2 + "\n" + account3 + "\n" + account4 + "\n" + account5)
}

class Account1 {
    var accountId: Int = 0
    var accountType: String = ""
    var accountHolderName: String = ""

    constructor(accountId: Int, accountType: String, accountHolderName: String) {
        this.accountId = accountId
        this.accountType = accountType
        this.accountHolderName = accountHolderName
    }

    override fun toString(): String {
        return "Account(accountId=$accountId, accountType='$accountType', accountHolderName='$accountHolderName')"
    }

}
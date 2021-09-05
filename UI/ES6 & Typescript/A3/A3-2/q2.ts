"use strict";
let totalBalance2 = 0;
class Account2 {
Id: any;
Name: any;
Balance: any;
    constructor(id: any, name: any, balance: any) {
        this.Id = id;
        this.Name = name;
        this.Balance = balance;
    }
    getBalance() {
        return this.Balance;
    }
}
class SavingAccount2 extends Account2 {
Cash_credit: number;
Interest: number;
    constructor(id: string, name: string, interest: number, cash_credit: number) {
        super(id, name, cash_credit);
        this.Interest = interest;
        this.Cash_credit = cash_credit;
        totalBalance2 += cash_credit;
    }
}
class CurrentAccount2 extends Account2 {
Cash_credit: number;
Interest: number;
    constructor(id: string, name: string, interest: number, cash_credit: number) {
        super(id, name, cash_credit);
        this.Interest = interest;
        this.Cash_credit = cash_credit;
        totalBalance2 += cash_credit;
    }
}
let mySAccount1_2 = new SavingAccount2("1", "A", 10, 1000);
let mySAccount2_2 = new SavingAccount2("2", "B", 10, 2000);
let myCAccount1_2 = new CurrentAccount2("3", "C", 10, 3000);
function getTotalBalance2() {
    console.log(totalBalance2);
}
getTotalBalance2();

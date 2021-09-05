"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var totalBalance = 0;
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.Id = id;
        this.Name = name;
        this.Balance = balance;
    }
    Account.prototype.getBalance = function () {
        return this.Balance;
    };
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, interest, cash_credit) {
        var _this = _super.call(this, id, name, cash_credit) || this;
        _this.Interest = interest;
        _this.Cash_credit = cash_credit;
        totalBalance += cash_credit;
        return _this;
    }
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, interest, cash_credit) {
        var _this = _super.call(this, id, name, cash_credit) || this;
        _this.Interest = interest;
        _this.Cash_credit = cash_credit;
        totalBalance += cash_credit;
        return _this;
    }
    return CurrentAccount;
}(Account));
var mySAccount1 = new SavingAccount("1", "Naveen", 10, 1000);
var mySAccount2 = new SavingAccount("2", "Don", 10, 2000);
var myCAccount1 = new CurrentAccount("3", "Elena", 10, 3000);
function getTotalBalance() {
    console.log(totalBalance);
}
getTotalBalance();

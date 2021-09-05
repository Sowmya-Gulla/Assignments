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
var totalBalance2 = 0;
var Account2 = /** @class */ (function () {
    function Account2(id, name, balance) {
        this.Id = id;
        this.Name = name;
        this.Balance = balance;
    }
    Account2.prototype.getBalance = function () {
        return this.Balance;
    };
    return Account2;
}());
var SavingAccount2 = /** @class */ (function (_super) {
    __extends(SavingAccount2, _super);
    function SavingAccount2(id, name, interest, cash_credit) {
        var _this = _super.call(this, id, name, cash_credit) || this;
        _this.Interest = interest;
        _this.Cash_credit = cash_credit;
        totalBalance2 += cash_credit;
        return _this;
    }
    return SavingAccount2;
}(Account2));
var CurrentAccount2 = /** @class */ (function (_super) {
    __extends(CurrentAccount2, _super);
    function CurrentAccount2(id, name, interest, cash_credit) {
        var _this = _super.call(this, id, name, cash_credit) || this;
        _this.Interest = interest;
        _this.Cash_credit = cash_credit;
        totalBalance2 += cash_credit;
        return _this;
    }
    return CurrentAccount2;
}(Account2));
var mySAccount1_2 = new SavingAccount2("1", "A", 10, 1000);
var mySAccount2_2 = new SavingAccount2("2", "B", 10, 2000);
var myCAccount1_2 = new CurrentAccount2("3", "C", 10, 3000);
function getTotalBalance2() {
    console.log(totalBalance2);
}
getTotalBalance2();

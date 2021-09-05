"use strict";
var MyClass = /** @class */ (function () {
    function MyClass(curr) {
        this.previousNo = fibo(curr - 1);
        this.currentNo = curr;
    }
    MyClass.prototype.next = function () {
        return fibo(this.currentNo + 1);
    };
    return MyClass;
}());
var fibo = function (n) {
    var a = 0, b = 1, f = 1;
    for (var i = 2; i <= n; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};
var myClass = new MyClass(6);
console.log(myClass.next());

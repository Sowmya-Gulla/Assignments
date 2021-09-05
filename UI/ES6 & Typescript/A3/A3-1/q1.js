"use strict";
var x = 10;
var y = 20;
var promise1 = Promise.resolve(x);
var promise2 = Promise.resolve(y);
console.log(promise1);
console.log(promise2);
Promise.all([promise1, promise2]).then(function (results) {
    var total = x + y;
    console.log("Results: " + results);
    console.log("Total: " + total);
});

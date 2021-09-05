"use strict";
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
//a
function add(a, b) {
    return a + b;
}
console.log(add(2, 2));
//b
function userFriends(username) {
    var names = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        names[_i - 1] = arguments[_i];
    }
    return username + "'s friends are : " + names.join(", ");
}
var friends = ["Broad", "Charlie", "Don", "Elena"];
console.log(userFriends.apply(void 0, __spreadArray(["Naveen"], friends, false)));
//c
var printCapital = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var _a = 0, names_1 = names; _a < names_1.length; _a++) {
        var name_1 = names_1[_a];
        console.log(name_1.toUpperCase());
    }
};
var myNames = ["Naven", "Broad", "Charlie", "Don", "Elena"];
printCapital.apply(void 0, myNames);

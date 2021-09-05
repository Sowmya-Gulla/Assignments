"use strict";
var n = 10;
console.log("Armstrong Numbers:");
function armstrong() {
    for (var i = n; i > 0; i++) {
        var numberOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_1 = temp; _i < temp_1.length; _i++) {
            var char = temp_1[_i];
            sum += Math.pow(parseInt(char), numberOfDigits);
        }
        if (sum == i) {
            console.log(i);
            n = i;
            break;
        }
    }
}
function getNextArmstrong() {
    n++;
    armstrong();
}
armstrong();
getNextArmstrong();

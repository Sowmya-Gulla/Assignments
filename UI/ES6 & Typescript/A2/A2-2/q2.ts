"use strict";
let n = 10;
console.log("Armstrong Numbers:");
function armstrong() {
    for (let i = n; i > 0; i++) {
        let numberOfDigits = i.toString().length;
        let sum = 0;
        let temp = i.toString();
        for (let char of temp) {
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


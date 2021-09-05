"use strict";
let n = 100;
console.log("Armstrong Numbers:");
function armstong2() {
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
function getNextArmstrong2() {
    n++;
    armstong2();
}
function reset() {
    n = 100;
}
armstong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();

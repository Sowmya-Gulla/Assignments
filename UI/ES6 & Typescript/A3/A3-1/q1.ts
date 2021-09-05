"use strict";
let x = 10;
let y = 20;
const promise1 =Promise.resolve(x);
const promise2 =Promise.resolve(y);
console.log(promise1);
console.log(promise2);
Promise.all([promise1, promise2]).then((results) => {
    const total = x+y;
    console.log(`Results: ${results}`);
    console.log(`Total: ${total}`);
});

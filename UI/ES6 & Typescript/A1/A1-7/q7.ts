"use strict";
//a
let arr = [1, 2, 3, 4];
let [a, b, c, d] = arr;
console.log(c);
//b
let myOrg = {
    name: "Bluemoon",
    address: {
        city: "Guntur",
        country: "India",
        pin: 522007,
    },
};
let { address: { pin }} = myOrg;
console.log(pin);

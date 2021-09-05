"use strict";
var names = ["Tom", "Ivan", "Jerry"];
var myArr: { name: any; length: any; }[] = [];
const myFun = (arr: string[]) => {
    for (let i of arr) {
        let myObj = { name: i, length: i.length };
        myArr.push(myObj);
    }
    return myArr;
};
const temp = myFun(names);
console.log(temp);
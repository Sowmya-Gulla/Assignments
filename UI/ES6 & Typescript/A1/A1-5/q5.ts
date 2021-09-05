"use strict";
//a
function add(a: number, b: number) {
    return a + b;
}
console.log(add(2, 2));
//b
function userFriends(username: string, ...names: string[]) {
    return username + "'s friends are : " + names.join(", ");
}
var friends = ["Broad", "Charlie", "Don", "Elena"];
console.log(userFriends("Naveen", ...friends));
//c
let printCapital=function (...names:string[]) {
    for(let name of names){
        console.log(name.toUpperCase());
    }
    
}
const myNames = ["Naveen","Broad","Charlie","Don","Elena"];
printCapital(...myNames);

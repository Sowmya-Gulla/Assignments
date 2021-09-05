"use strict";
var circle = {
    print: function () {
        return "This is a Circle";
    }
};
var employee = {
    print: function () {
        return "This is an Employee";
    }
};
function printAll(obj, obj2) {
    console.log(obj.print());
    console.log(obj2.print());
}
printAll(circle, employee);

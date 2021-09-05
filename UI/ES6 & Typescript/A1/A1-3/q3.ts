"use strict";
const Order = {
    id: 1,
    title: "Pizza",
    price: 1000,
   
    printOrder: function () {
        console.log(`The Order ID : ${this.id}, Item: ${this.title}`);
    },
    getPrice: function () {
        console.log(`Price: ${this.price}`);
    }
};
Order.printOrder();
Order.getPrice();
const copy=Object.assign(Order);
copy.printOrder();
copy.getPrice();

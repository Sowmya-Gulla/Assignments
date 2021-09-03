var num1=1;
var num2=1;
console.log(num1);
console.log(num2);
function fibonacci(num1,num2){
    for(var i=2;i<=100;i++){
        var num3=num1+num2;
        console.log(num3);
        num1=num2;
        num2=num3;

    }
}
fibonacci(num1,num2);
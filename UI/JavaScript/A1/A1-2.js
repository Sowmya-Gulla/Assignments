var num=5
var sum=0;
for(var i=1;i<=num;i++){
    if((num%3==0) || (num%5==0)){
        sum+=i;
    }
    
}
console.log(sum);
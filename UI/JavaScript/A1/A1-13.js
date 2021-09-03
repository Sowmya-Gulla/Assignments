var arr=[1,2,3,4,5];
var sum=0;
for(var i=0;i<arr.length;i++){
    sum+=arr[i];
}
console.log(sum);
sum=0;
var i=0;
while(i<arr.length){
    sum+=arr[i];
    i++;
}
console.log(sum);
sum=0;
var i=0;
do{
    sum+=arr[i];
    i++;
}while(i<arr.length);
console.log(sum);
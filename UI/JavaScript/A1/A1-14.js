const arr_len=100;
var randomArray=[];
for(var i=0;i<arr_len;i++){
    randomArray.push(Math.random());
}
randomArray.sort();
console.log("Largest - "+randomArray[arr_len-1]);
console.log("Smallest - "+randomArray[0]);
var evenCount=0;
var oddCount=0;
for(var i=0;i<randomArray;i++){
    if(randomArray[i]%2==0){
        evenCount+=1;
    }
    else{
        oddCount+=1;
    }
}
if(evenCount>oddCount){
    console.log("Even count is high");
}
else{
    console.log("Odd count is high");

}
var sum=0;
for(var i=0;i<arr_len;i++){
    sum+=randomArray[i];
}
console.log("Sum - "+sum);
console.log("Average - "+sum/100);

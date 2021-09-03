var yr=2021;
var count=0;
while(count<20){
    if(yr%4==0 && (yr%400==0 || yr%100!=0)){
        console.log(yr);
        count++;
    }
    yr++;
}


function longestToken(str){
    var max=0;
    var start=0;
    var end=0;
    var i=0;
    for(x=0;x<str.length;x++){
        if(str[x]=='a' || str[x]=='b'){
            len=x-i;
            if(max<len){
                max=len;
                start=i;
                end=x;
            }
            i=x+1;
        }
        if(x==str.length-1 && str[x]!='a' && str[x]!='b'){
            len=x+1-i;
            if(max<len){
                start=i;
                end=x+1;    
            }
        }
    }
    return str.slice(start,end);
    

    
}

console.log(longestToken("ababcdababefgababhiab"));

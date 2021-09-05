var recursiveMap=function(arr,f){
    if(arr.length===1){
        return f(arr);
    }
    else
    {
        return [f(arr[0])].concat(recursiveMap(arr.slice(1),f));
    }
}
var mult=function(v){
return v*2;
}
var result =recursiveMap([1,2,3,4],mult);
console.log(result);
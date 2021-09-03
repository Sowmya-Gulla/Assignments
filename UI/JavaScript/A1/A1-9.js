var arr1=["a","b","c"];
var arr2=[1,2,3];
function mergeAlternative(arr1,arr2){
    var result=[];
    for(var i=0;i<arr1.length + arr2.length;i++){
        if(i%2==0){
            result.push(arr1[i/2]);
        }
        else{
            result.push(arr2[(i-1)/2]);
        }
    }
    return result;
};
console.log(mergeAlternative(arr1,arr2));
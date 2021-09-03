var arr_len=20;
var arr=[];
for(var i=0;i<arr_len;i++)
{
    arr[i]=Math.random();

}
function bubble_sort(arr){
    var i=0,j=0;
    for(i=0;i<arr_len;i++){
        for(j=0;j<arr_len-1;j++){
            if(arr[i]>arr[j+1]){
                var temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
    }
    return arr;
}
console.log(bubble_sort(arr));
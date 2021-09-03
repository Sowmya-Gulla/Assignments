var nums=[1,2,3,4,5,6];
var k=2;
function rotate(nums, k) {
    for (let i = 0; i < k; i++) {
        nums.unshift(nums.pop()) 
    }
    return nums;
}
console.log(rotate(nums,k));
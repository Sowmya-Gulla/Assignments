function isEven(num) {
    return num % 2 == 0;
}
const find = (arr, isEven) => () => {
    for (i = 0; i < arr.length; i++) {
      if (isEven(arr[i])) {
        return arr[i];
      }
      continue;
    }
};
  
const getNumber = find([1, 3, 5, 4, 2], isEven);

console.log(getNumber());
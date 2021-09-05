function pure(arr, isEven) {
    if (isEven(arr.slice(0, 1)[0])) {
      return arr[0];
    } else {
      arr.shift();
      return pure(arr, isEven);
    }
}
function isEven(num) {
    return num % 2 == 0;
}

const getNumber = pure([1, 3, 5, 4, 2], isEven);

console.log(getNumber);
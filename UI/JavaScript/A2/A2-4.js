const map = (arr, square) => () => {
    for (i = 0; i < arr.length; i++) {
      arr[i] = square(arr[i]);
    }
    return arr;
};
const square = (x) => x * x;

const getSquare = map([1, 2, 3, 4, 5], square);
console.log(getSquare());

const getSqrt = map([1, 4, 9, 16, 25], Math.sqrt);
console.log(getSqrt());
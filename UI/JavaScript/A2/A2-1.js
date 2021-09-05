const composedValue = (f1, f2, value) => () => f1(f2(value));

function square(x) {
  return x * x;
}
function double(x) {
  return x * 2;
}

const getNumber = composedValue(square, double, 5);
console.log("Result : " + getNumber());
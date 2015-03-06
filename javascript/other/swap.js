/*
 * The challenge here is to write a function that swaps two numbers without using a tmp variable
 */
function swap() {
  var a= 7, b= 5;

  a = a - b;
  b = a + b;
  a = b - a;

  console.log('a = '+a);
  console.log('b = '+b);
}

swap();

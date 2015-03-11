#include "stdio.h"
#include "stdlib.h"


/*
 * This algorithm uses recursion to compute
 * the value of an exponent. This allows This
 * algorithm to run with a complexity of O(logn)
 * as opposed to O(n) otherwise
 */
int quick_expo(int x, int n) {
  int tmp = 0;
  if (n == 0)
    return 1;
  if (n % 2 == 0) {
   tmp = quick_expo(x, n/2);
   return tmp * tmp;
  } else {
    return x * quick_expo(x, n-1);
  }
}

int main() {

  printf("Result is %d\n", quick_expo(2, 4));

}

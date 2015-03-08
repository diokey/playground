#include "stdio.h"
#include "stdlib.h"

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

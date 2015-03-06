#include "stdio.h"
#include "stdlib.h"

/*
 * Implementing a swap function without using a temp variable
 */
void swap() {
  int a = 5;
  int b = 7;

  printf("Before ");
  printf("a = %d , b = %d \n",a, b);
  
  a = a - b;
  b = a + b;
  a = b - a;

  printf("After ");
  printf("a = %d , b = %d \n",a, b);
}

/*
 * This is another method for Implementing inplace swap using bit manipulation
 */
void bit_swap() {
  int a = 5;
  int b = 7;

  printf("Before ");
  printf("a = %d , b = %d \n",a, b);
  
  a = a^b;
  b = a^b;
  a = a^b;

  printf("After ");
  printf("a = %d , b = %d \n",a, b);
}

int main() {

  swap();
  bit_swap();
}

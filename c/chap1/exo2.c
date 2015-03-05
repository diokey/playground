#include<stdlib.h>
#include<stdio.h>

void reverse(char* str) {
  char* end = str;
  char tmp;

  if (str) { 
    while(*end) { /* find end of the string */
     ++end; 
    }

    --end; /* set one char back, since last char is null */
    
    /* Swap characters from start of string with the end of 
    * string, until pointers meet in middle
    */ 
    while (str < end) { 
      tmp = *str;
      *str++ = *end;
      *end-- = tmp;
    }
  }
}

int main() {
  
  char str[] = "Olivier";
  reverse(str);

  printf("The reversed word is %s\n",str);
  return 0;
}

#include "stdio.h"
#include "stdlib.h"


int search(int tab[], int val, int begin, int end) {
  if (begin > end)
    return 0;
  int mid = (end + begin) / 2;
  int res = tab[mid];

  if (res == val)
    return 1;
  else {
    if (res > val) {
      return search(tab, val, begin, mid-1);
    } else {
      return search(tab, val, mid+1, end);
    }
  }

}

int main() {

  int values[] = {110, 120, 130, 150, 170, 180, 200};
  int i =0;

  int rep = search(values, 120, 0, 6);
  int rep2 = search(values, 100, 0, 6);

  printf("Result : %d\n", rep);
  printf("Result 2 : %d\n", rep2);
}

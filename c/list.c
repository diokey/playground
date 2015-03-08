#include "stdio.h"
#include "stdlib.h"

struct list
{
  int val;
  struct list *next;
};

typedef struct list List;

void free_list(List *list) {

  while(list != NULL) {
    List *l = list;
    list = list->next;
    free(l);
  }
}

List* cons(int val, List *list) {
  List *el = malloc(sizeof(List));
  if (NULL == el)
    exit(EXIT_FAILURE);

  el->val= val;
  el->next = list;

  return el;
}

int size(List *list) {
  int size = 0;
  while (list != NULL) {
    size++;
    list = list->next;
  }

  return size;
}

#include <stdio.h>
#include <stdlib.h>
#define UNDERFLOW_CHAR '\0'

typedef enum {NO,YES} BOOL;

typedef struct Node {
	char data;
	struct Node * next;
} NODE;

typedef NODE * NodePtr;

NodePtr createNode () {
	NodePtr temp = (NodePtr)malloc(sizeof(NODE));
	temp->next = temp;
	temp->data = UNDERFLOW_CHAR;
	return temp;
}

void insert (NodePtr list, char item) {
	NodePtr temp = createNode();
	NodePtr p;	
	temp->data = item;
	temp->next = list;
	if (list->next == list)
		list->next = temp;
	else {
		p = list->next;
		while (p->next != list)
			p = p->next;
		p->next = temp;
	}
}

void display (NodePtr list) {
	NodePtr temp = list->next;
	if (temp != list)  {
		while (temp->next != list) {
			printf(" %c ->", temp->data);
			temp = temp->next;
		}
		printf(" %c", temp->data);
		temp = temp->next;
	}
}

int main (int argc, const char * argv []) {
	NodePtr list1 = createNode();
	NodePtr list2 = createNode();
	NodePtr newList = createNode();
	int i, n;
	char item;
	printf("enter number of elements in list 1: ");
	scanf("%d", &n);
	printf("enter list 1 elements in ascending order: \n");
	for (i=0; i<n; ++i) {
		scanf(" %c", &item);
		insert(list1, item);
	}
	printf("enter number of elements in list 2: ");
	scanf("%d", &n);
	printf("enter list 2 elements in ascending order: \n");
	for (i=0; i<n; ++i) {
		scanf(" %c", &item);
		insert(list2, item);
	}
	NodePtr temp1 = list1->next;
	NodePtr temp2 = list2->next;
	while (temp1 != list1 && temp2 != list2) {
		char c1 = temp1->data;
		char c2 = temp2->data;
		if (c1 > c2) {
			insert(newList, c2);
			temp2 = temp2->next;
		}
		else {
			insert(newList, c1);
			temp1 = temp1->next;
		}
	}
	while (temp1 != list1) {
		insert(newList, temp1->data);
		temp1 = temp1->next;
	}
	while (temp2 != list2) {
		insert(newList, temp2->data);
		temp2 = temp2->next;
	}
	printf("list 1: ");
	display(list1);
	printf("\nlist 2: ");
	display(list2);
	printf("\nmerged LIST: ");
	display(newList);
	printf("\n\n");
}
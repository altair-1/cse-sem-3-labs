#include <stdio.h>
#include <stdlib.h>

typedef struct node{
	int info;
	struct node *link;
} NODE;

NODE* push(NODE *list,int x){
	NODE *new,*temp;
	new=(NODE*) malloc(sizeof(NODE));
	new->link=list;
	new->info=x;
	return(new);
}

NODE* pop(NODE *list){
	NODE *prev,*temp;
	if(list==NULL){
		printf("\nStack Underflow\n");
		return(list);
	}
	temp=list;
	printf("Deleted element is %d",temp->info);
	free(temp);
	list = list->link;
	return(list);
}

void display(NODE *list){
	NODE *temp;
	printf("\n\nSTACK:");
	if(list==NULL){
		printf(" Stack is empty");
		printf("\n\n**********************************************");
	return;
}
temp=list;
while(temp!=NULL){
	printf("%5d",temp->info);
	temp=temp->link;
}
printf(" <- TOP");
printf("\n\n**********************************************");
}

int getchoice(){
	int ch;
	printf("**********************************************\n\n");
	printf("--------------------Menu--------------------\n");
	printf("1. Push\n2. Pop\n3. Display\n4. Exit\n");
	printf("Enter your choice:");
	scanf("%d",&ch);
	return(ch);
}
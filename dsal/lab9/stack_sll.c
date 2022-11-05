#include<stdio.h>
#include "stack_sll_fun.h"

int main(){
	NODE *list;
	int x,ch;
	list=NULL;
	while(1){
		ch=getchoice();
		switch(ch){
			case 1: printf("Enter the element to be pushed:");
			scanf("%d",&x);
			list=push(list,x);
			display(list);
			break;
			case 2: list=pop(list);
			display(list);
			break;
			case 3: display(list);
			getch();
			break;
			case 4: exit(1);
			default: printf("\nInvalid choice");
			printf("\n\n**********************************************");
		}
	}
	return 0;
}
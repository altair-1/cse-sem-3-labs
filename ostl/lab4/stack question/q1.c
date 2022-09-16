#include <stdio.h>
#include <stdlib.h>
#include "func.h"

int main() {

	int i,n,*arr,input,tos=-1,x;
	printf("enter max stack size: ");
	scanf("%d",&n);
	
	arr = (int *) calloc(n,sizeof(int));
	
	do {
	
		printf("\nenter 1 to push, 2 to pop, 3 to display, -1 to quit");
		scanf("%d",&input);
		
		if (input == 1) {
			printf("enter the number you want to push: ");		
			scanf("%d",&x);
			tos=push(arr,n,tos,x);
			if (tos == -1) 
				printf("stack limit exceeded, no changes were made");
		}

		else if(input == 2) {
			tos=pop(arr,tos);
			if (tos == -5) 
				printf("there is no element to pop, no changes were made");
		}

		else if (input == 3) {
			printf("\n");
			display(arr,tos);
		}

		else {
			input = -1;
			printf("exiting");
		}

	} while(input != -1);

	return 0;

}

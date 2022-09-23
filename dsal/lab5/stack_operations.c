#include <stdio.h>
#include <stdlib.h>
#include "stack_operations.h"

void main()
{
	char expn[25],c,d;
	int i=0;
	stack s;
	s.top=-1;
	printf("enter the expression: ");
	scanf("%s",expn);
	while((c=expn[i++])!='\0')
	{
		if(c=='(')
			push(&s,c);
		else
			if(c==')')
			{	
				d=pop(&s);
				if(d!='(')
				{
					printf("\ninvalid expression");
					break;
				}
			}
	}		
	if(empty(&s))
		printf("\nbalanced expression");
	else
		printf("\nnot a balanced expression");
}
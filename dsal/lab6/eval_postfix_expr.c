#include<stdio.h>
#include "eval_postfix_fun.h"
int main()
{
stack s;
char x;
int op1,op2,val;
init(&s);
printf("Enter the expression(eg: 59+3*)\nsingle digit operand and operators only:");
while((x=getchar())!='\n')
{
if(isdigitdigit(x))
push(&s,x-‘0’);
/*x-‘0’ for removing the effect of ascii */
else
{
op2=pop(&s);
op1=pop(&s);
val=evaluate(x,op1,op2);
push(&s,val);
}
}
val=pop(&s);
printf("\nvalue of expression=%d",val);
return 0;
}
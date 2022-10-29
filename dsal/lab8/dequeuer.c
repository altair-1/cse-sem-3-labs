#include<stdio.h>
#include "dequeue_fun.h"
int main()
{
int i,x,op,n;
dequeue q;
initialize(&q);
do
{
printf("\n1.Create\n2.Insert(rear)\n3.Insert(front)\n4.Delete(rear)\n5.Delete(front)");
printf("\n6.Print\n7.Exit\n\nEnter your choice:");
scanf("%d",&op);
switch(op)
{
case 1: printf("\nEnter number of elements:");
scanf("%d",&n);
initialize(&q);
printf("\nEnter the data:");
for(i=0;i<n;i++)
{
scanf("%d",&x);
if(full(&q))
{
printf("\nQueue is full!!");
exit(0);
}
enqueueR(&q,x);
}
break;
case 2: printf("\nEnter element to be inserted:");
scanf("%d",&x);
if(full(&q))
{
printf("\nQueue is full!!");
exit(0);
}
enqueueR(&q,x);
break;
case 3: printf("\nEnter the element to be inserted:");
scanf("%d",&x);
if(full(&q))
{
printf("\nQueue is full!!");
exit(0);
}
enqueueF(&q,x);
break;
case 4: if(empty(&q))
{
printf("\nQueue is empty!!");
exit(0);
}
x=dequeueR(&q);
printf("\nElement deleted is %d\n",x);
break;
case 5: if(empty(&q))
{
printf("\nQueue is empty!!");
exit(0);
}
x=dequeueF(&q);
printf("\nElement deleted is %d\n",x);
break;
case 6: print(&q);
break;
default: break;
}
}while(op!=7);
return 0;
}
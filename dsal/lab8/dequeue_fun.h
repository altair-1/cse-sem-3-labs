#include <stdio.h>
#include <stdlib.h>
#define MAX 30
typedef struct dequeue
{
int data[MAX];
int rear,front;
}dequeue;
void initialize(dequeue *p);
int empty(dequeue *p);
int full(dequeue *p);
void enqueueR(dequeue *p,int x);
void enqueueF(dequeue *p,int x);
int dequeueF(dequeue *p);
int dequeueR(dequeue *p);
void print(dequeue *p);
void initialize(dequeue *P)
{
P->rear=-1;
P->front=-1;
}
int empty(dequeue *P)
{
if(P->rear==-1)
return(1);
return(0);
}
int full(dequeue *P)
{
if((P->rear+1)%MAX==P->front)
return(1);
return(0);
}
void enqueueR(dequeue *P,int x)
{
if(empty(P))
{
P->rear=0;
P->front=0;
P->data[0]=x;
}
else
{
P->rear=(P->rear+1)%MAX;
P->data[P->rear]=x;
}
}
void enqueueF(dequeue *P,int x)
{
if(empty(P))
{
P->rear=0;
P->front=0;
P->data[0]=x;
}
else
{
P->front=(P->front-1+MAX)%MAX;
P->data[P->front]=x;
}
}
int dequeueF(dequeue *P)
{
int x;
x=P->data[P->front];
if(P->rear==P->front)
/*delete the last element */
initialize(P);
else
P->front=(P->front+1)%MAX;
return(x);
}
int dequeueR(dequeue *P)
{
int x;
x=P->data[P->rear];
if(P->rear==P->front)
initialize(P);
else
P->rear=(P->rear-1+MAX)%MAX;
return(x);
}
void print(dequeue *P)
{
if(empty(P))
{
printf("\nQueue is empty!!");
exit(0);
}
int i;
i=P->front;
while(i!=P->rear)
{
printf("\n%d",P->data[i]);
i=(i+1)%MAX;
}
printf("\n%d\n",P->data[P->rear]);
}
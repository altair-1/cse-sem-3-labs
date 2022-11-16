#include<stdio.h>
#include<stdlib.h>
#include “poly_add_dll_fun.h”
int main()
{
int m,n,e,k;
NODE h1,h2,h3,h4;
h1=(NODE)malloc(sizeof(struct node));
h2=(NODE)malloc(sizeof(struct node));
h3=(NODE)malloc(sizeof(struct node));
h4=(NODE)malloc(sizeof(struct node));
h1->rlink=h1;
h1->llink=h1;
h2->rlink=h2;
h2->llink=h2;
h3->rlink=h3;
h3->llink=h3;
h4->rlink=h4;
h4->llink=h4;
printf("\nnumber of nodes in list1\n");
scanf("%d",&n);
while(n>0)
{
scanf("%d",&m);
scanf("%d",&e);
h1=add(h1,m,e);
n--;
}
display(h1);
printf("\nnumber of nodes in list2\n");
scanf("%d",&k);
while(k>0)
{
scanf("%d",&m);
scanf("%d",&e);
h2=add(h2,m,e);
k--;
}
display(h2);
printf("\nthe sum is\n");
h3=sum(h1,h2,h3);
display(h3);
return 1;
}
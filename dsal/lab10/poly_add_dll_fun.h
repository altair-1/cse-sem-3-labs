#include <stdio.h>
#include <stdlib.h>
struct node
{
int info;
int ex;
struct node *llink;
struct node *rlink;
};
typedef struct node *NODE;
NODE add(NODE head,int n,int e)
{
NODE temp,last;
temp=(NODE)malloc(sizeof(struct node));
temp->info=n;
temp->ex=e;
last=head->llink;
temp->llink=last;
last->rlink=temp;
temp->rlink=head;
head->llink=temp;
return head;
}
NODE sum(NODE h1,NODE h2,NODE h3)
{
NODE one,two;
one=h1->rlink;
two=h2->rlink;
while(one!=h1 && two!=h2)
{
if((one->ex)==(two->ex))
{
h3=add(h3,((one->info)+(two->info)),one->ex);
one=one->rlink;
two=two->rlink;
}
else if(one->ex>two->ex)
{
h3=add(h3,one->info,one->ex);
one=one->rlink;
}
else
{
h3=add(h3,two->info,two->ex);
two=two->rlink;
}
}
while(two!=h2)
{
h3=add(h3,two->info,two->ex);
two=two->rlink;
}
while(one!=h1)
{
h3=add(h3,one->info,one->ex);
one=one->rlink;
}
return h3;
}
void display(NODE head)
{
printf("\ncontents of list are\n");
NODE temp=NULL;
temp=head->rlink;
while(temp!=head)
{
printf("%d %d\t",temp->info,temp->ex);
temp=temp->rlink;
}
}
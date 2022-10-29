#include<stdio.h>
#include<malloc.h>

typedef struct que
{
    int info,prio;
    struct que *next;
} nodetype;

void insert(nodetype**,nodetype**,int,int);
void serve(nodetype**,nodetype**);
void display(nodetype*);

void main()
{
    nodetype *front=NULL,*rear=NULL;
    int ch,pr,num,c=0;
    
    printf("1. insert\n2. serve\n3. display\n4. exit\nchoice: ");
    
    do
    {
        scanf("%d",&ch);
        switch(ch)
        {
             case 1: printf("\nenter the number to be inserted and its priority: \n");
             scanf("%d  %d",&num,&pr);
             insert(&front,&rear,num,pr);
             break;
             case 2: if(front==NULL)
             printf("\nno elements are present in the priority queue");
             else
             serve(&front,&rear);
             break;
             case 3: if(front==NULL)
             printf("\nno elements in the priority queue");
             else
             display(front);
             break;
             default:
             printf("\nenter the correct choice");
        }
        printf("press 1 to continue\n");
        scanf("%d",&c);
    }while(c==1);
}

void insert(nodetype **front,nodetype **rear,int num,int pr)
{
    nodetype *p=NULL,*tmp=*front;
    p=(nodetype*)malloc(sizeof(nodetype));
    if(p!=NULL)
    {
         p->info=num;
         p->prio=pr;
         p->next=NULL;
    }
    if((*rear)==NULL)
    {
         (*front)=(*rear)=p;
    }
    else
    {
         if((p->prio)>((*rear)->prio))
         {
              (*rear)->next=p;
              (*rear)=p;
         }
         else if(p->prio<((*front)->prio))
         {
              p->next=(*front);
              (*front)=p;
         }
         else
         {
              while(((tmp->next)->prio)<(p->prio))
              tmp=tmp->next;
              p->next=tmp->next;
              tmp->next=p;
         }
    }
}

void serve(nodetype **front,nodetype **rear)
{
    nodetype *tmp=*front;
    if((*front)==(*rear))
    {
        printf("the served element is %d",(*front)->info);
        (*rear)=(*front)=NULL;
    }
    else
    {
        printf("the served element is %d",(*front)->info);
        (*front)=(*front)->next;
    }
    free(tmp);
}

void display(nodetype *front)
{
    nodetype *tmp;
    tmp=front;
    while(tmp!=NULL)
    {
         printf("%d ",tmp->info);
         tmp=tmp->next;
    }
}
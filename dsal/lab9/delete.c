#include<stdio.h>
#include<stdlib.h>

typedef struct NODE *Nodeptr;

typedef struct NODE{
    int data;
    Nodeptr next;
} NODE;

Nodeptr getNodeptr(){
    Nodeptr temp = (Nodeptr)malloc(sizeof(NODE));
    return temp;
}

Nodeptr InsertFront(Nodeptr head,int item){
    Nodeptr temp = getNodeptr();
    temp->data = item;
    temp->next = head;
    return temp;
}

Nodeptr InsertLast(Nodeptr head,int item){
    Nodeptr rear,temp;
    temp = getNodeptr();
    temp->data = item;
    temp->next = NULL;
    rear = head;
    if(head == NULL){
        head = temp;
        return head; 
    }
    else{
        while(rear->next){
            rear = rear->next;
        }
        rear->next = temp;
        return head;
    }
}

void Delete(Nodeptr *head){
    Nodeptr current = *head;
    Nodeptr next,prev;   
    if(head == NULL){
        printf("empty list\n");
    }
    else{
        while(current != NULL){
            next = current->next;
            prev = current;
            while(next!=NULL){
                if(current->data == next->data){
                    prev->next = next->next;
                    free(next);
                    next = prev;
                }
                next = next->next;
                prev = prev->next;
            }
            current = current->next;
        }
    }
}

void Display(Nodeptr head){
    Nodeptr temp;
    temp = head;
    while(temp){
        printf("%d ",temp->data);
        temp = temp->next;
    }
}

int main(){
    Nodeptr List = NULL;
    List = InsertFront(List,10);
    List = InsertFront(List,5);
    List = InsertFront(List,5);
    List = InsertLast(List,20);
    List = InsertLast(List,30);
    List = InsertLast(List,30);
    printf("initial list: ");
    Display(List);
    printf("\nafter removing duplicates: ");
    Delete(&List);
    Display(List);
    printf("\n");
    return 0;
}
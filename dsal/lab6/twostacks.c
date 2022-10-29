#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int * st;
    int tos1,tos2,n;
} Stack;

int checkOverflow(Stack *s) {
    if (s->tos2 == (s->tos1)+1)
        return 1;
    return 0;
}

void push1(Stack *s,int x) {
    if (checkOverflow(s)) {
        printf("error, overflow");
        return;
    }
    (s->st)[++(s->tos1)] = x;
}

int pop1(Stack *s) {
    if (s->tos1 == -1) {
        printf("error, underflow");
        return -5;
    }
    return (s->st)[(s->tos1)--];
}

void push2(Stack *s,int x) {
    if (checkOverflow(s)) {
        printf("error, overflow");
        return;
    }
    (s->st)[--(s->tos2)] = x;
}

int pop2(Stack *s) {
    if (s->tos2 == s->n) {
        printf("error, underflow");
        return -5;
    }
    return (s->st)[(s->tos2)++];
}

int main() {
    int n,inp=-1,temp;
    Stack s;
    printf("enter max stack size: ");
    scanf("%d",&n);
    s.st = (int *) malloc(n*sizeof(int));
    s.tos1=-1;
    s.tos2=n;
    s.n = n;
    printf("1. push1, 2. push2, 3. pop1, 4. pop2, -1. exit");
    do {
        printf("\nenter choice: ");
        scanf("%d",&inp);
        if (inp == 1) {
            printf("enter number to push: ");
            scanf("%d",&temp);
            push1(&s,temp);
        }
        else if (inp == 2) {
            printf("enter number to push: ");
            scanf("%d",&temp);
            push2(&s,temp);
        }
        else if (inp == 3) {
            printf("\nnumber popped is %d",pop1(&s));
        }
        else if (inp == 4) {
            printf("\nnumber popped is %d",pop2(&s));
        }
        else {
            inp = -1;
        }
    } while(inp != -1);
    return 0;
}
#include <stdio.h>

typedef struct {
    char st[10];
    int tos;
} STACK;

int isFull(STACK s) {
    if ((s.tos+1) > 9)
        return 1;
    return 0; 
}

int isEmpty(STACK s) {
    if (s.tos == -1)
        return 1;
    return 0;
}


STACK push(STACK s) {
    char x;
    if (isFull(s))
        printf("overflow error");
    else {
        printf("enter a character to push: ");
        scanf(" %c",&x);
        s.tos = s.tos + 1;
        s.st[s.tos] = x;
    }
    return s;
}

STACK pop(STACK s) {
    if (isEmpty(s))
        printf("underlow error");
    else {
        printf("popped character is %c",s.st[s.tos]);
        s.st[s.tos] = -5;
        s.tos-=1;
    }
    return s;
}

void display(STACK s) {
    int i;
    for (i=0;i<=s.tos;i++) {
        printf("%c ",s.st[i]);
    }
}

int main() {

    STACK s;
    s.tos = -1;
    int input;
    do {
        printf("\nenter your choice: \n1. push\n2. pop\n3. display\n4. exit\n");
        scanf("%d",&input);

        if (input == 1) {
            s = push(s);
        }

        else if (input == 2) {
            s = pop(s);
        }

        else if (input == 3) {
            display(s);
        }

        else if (input == 4){
            printf("exiting");
            break;
        }
        
        else{
            printf("invalid input");
        }

    } while (input != 4);
    return 0;
}
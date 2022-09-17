#include<stdio.h>

int moves = 0;

void tower (int n, char from, char intermediate, char to)
{
    moves++;
    if (n == 1)
    {
        printf("move disc 1 from %c to %c\n", from, to);
        return;
    }
    else
    {
        tower (n-1, from, to, intermediate);
        printf("move disc %d from %c to %c\n", n, from, to);
        tower (n-1, intermediate, from, to);
    }
}

int main()
{
    int n;
    printf("enter number of discs:\n");
    scanf("%d", &n);
    tower(n, 'A', 'B', 'C');
    printf("total moves taken: %d\n", moves);
    return 0;
}
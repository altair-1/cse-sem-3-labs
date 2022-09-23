#include <stdio.h>

void main()
{
    int n,a[100],rem,tos=-1;
    printf("enter a number \n");
    scanf("%d",&n);
    
    while(n>0)
    {
        rem=n%2;
        n/=2;
        tos++;
        a[tos]=rem;
    }
    
    printf("binary number is ");
    while(tos!=-1)
    {
        printf("%d",a[tos]);
        tos--;
    }
    printf("\n");
}

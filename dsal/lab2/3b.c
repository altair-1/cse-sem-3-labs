#include<stdio.h>

int * exchange(int *px)
{
	int *temp ;
	
	temp=px;

	return temp;
}

int main()
{
	int *a;
	printf("enter: ");
	scanf("%d",a);
	int *hel=exchange(a);
	printf("%d",*a);
    
    return 0;
}

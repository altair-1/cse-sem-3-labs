#include<stdio.h>

int fib(int n)
{
	if(n<2)
		return n;
	return fib(n-1)+ fib(n-2);
}

int main()
{
	int n, count;
	printf("enter number of terms: ");
	scanf("%d", &n);
	printf("fibonacci series: ");
	for(count=0; count<n; count++)
		printf("\n%d", fib(count));
	printf("\n");
}
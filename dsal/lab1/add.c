#include <stdio.h>

void Add(double arr[],int n);
int main()
{
	double arr[10];
	int n,i;
	printf("enter number of elements: \n");
	scanf("%d",&n);
	printf("enter elements: \n");
	
	for(i=0;i<n;i++)
	{
		scanf("%lf",&arr[i]);
	}
	
	Add(arr,n);
	return 0;
}

void Add(double arr[],int n)
{
	int i;
	double sum=0;
	for(i=0;i<n;i++){
		sum=sum+arr[i];
	}
	printf("%lf is the sum",sum);
}
#include<stdio.h>

int Smallest(int *ar, int n)
{
	int small=ar[0];
	
	for(int i=0; i<n; i++)
	{
		if(ar[i]<small)
		{
			small=ar[i];
		}
	}
	printf("smallest element is %d", small);
}

int main()
{
	int ar[100];
	int n;
	printf("enter the number of elements: \n");
	scanf("%d", &n);
	
	printf("enter array elements: \n");
	for(int i=0; i<n; i++)
	{
		scanf("%d", &ar[i]);
	}
	Smallest(ar, n);
	return 0;
}
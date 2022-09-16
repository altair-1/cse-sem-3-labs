#include<stdio.h>

void Sec(int arr[],int n);

int main()
{
	int arr[10],i,n;
	printf("enter number of elements: \n");
	scanf("%d",&n);
	printf("enter elements: \n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	Sec(arr,n);
	return 0;
}

void Sec(int arr[],int n)
{
	int i,l1,l2;
	l1=arr[0];
	l2=arr[1];
	for(i=1;i<n;i++)
	{
		if(arr[i]>l1)
		{
			l2=l1;
			l1=arr[i];
		}
		else if(arr[i]>l2)
		{
			l2=arr[i];
		}
	}
	printf("the second largest element is %d",l2);
}
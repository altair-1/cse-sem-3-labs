#include<stdio.h>

int Lsearch(int arr[],int n, int ele);
int main()
{
	int arr[10],i,n,ele,x;
	printf("enter number of elements: \n");
	scanf("%d",&n);
	printf("enter elements: \n");
	
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	printf("enter element to search for: ");
	scanf("%d",&ele);
	x=Lsearch(arr,n,ele);
	if(x)
	{
		printf("element found at position %d",x);
	}
	else
	{
		printf("element not found");
	}
	return 0;
}

int Lsearch(int arr[],int n, int ele)
{
	int i, flag=0;
	for(i=0;i<n;i++){
		if(arr[i]==ele){
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		return i+1;
	}
	else
	{
		return 0;
	}
}
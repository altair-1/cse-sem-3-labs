#include<stdio.h>

int Reverse(int *arr, int num)
{
    int *plast;
	plast = arr+num-1;
	int *pmid;
	pmid = arr+(num/2);
	int *p;
	
	for(p=arr;p<pmid; p++,plast--)
	{
		int temp = *p;
		*p = *plast;
		*plast = temp;
	}
	
	plast = arr+num-1;
	printf("reversed array: \n");
	for(p=arr;p<=plast;p++)
	{
		printf("%d ", *p);
	}
}

int main()
{
	int arr[10], num;
	
	printf("enter array size: \n");
	scanf("%d", &num);
	
	printf("enter array elements: \n");
	for(int i=0; i<num; i++)
		scanf("%d", &arr[i]);
	Reverse(arr, num);
	return 0;
}
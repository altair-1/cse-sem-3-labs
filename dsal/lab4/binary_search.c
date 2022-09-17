#include <stdio.h>
#include "binary_search_func.h"

void main()
{
	int i, pos, a[30],n, item;
	printf("enter number of items: ");
	scanf("%d",&n);
	printf("enter the elements in ascending order:\n");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
		printf("enter element to be searched: ");
		scanf("%d",&item);
		pos=bin_search(0,n-1,item,a);
		if(pos!=-1)
			printf("item found at location %d",pos+1);
		else
			printf("item not found");
}
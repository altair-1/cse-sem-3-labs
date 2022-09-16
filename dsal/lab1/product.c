#include<stdio.h>

void Multiply(int arr1[][10],int arr2[][10],int m,int p,int q);

int main()
{
	int arr1[10][10],arr2[10][10];
	int m,n,p,q,i,j;
	printf("enter dimensions of first array: \n");
	scanf("%d %d",&m,&n);
	printf("enter dimensions of second array: \n");
	scanf("%d %d",&p,&q);
	if(n!=p)
	{
		printf("matrices cannot be multiplied");
	}
	else
	{
		
		printf("enter elements of first array: \n");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				scanf("%d",&arr1[i][j]);
			}
		}
		
		printf("enter elements of second array: \n");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				scanf("%d",&arr2[i][j]);
			}
		}
		Multiply(arr1,arr2,m,p,q);
	}
	return 0;
}

void Multiply(int arr1[][10],int arr2[][10],int m,int p,int q)
{
	int i,j,k,mu[10][10];
	for(i=0;i<m;i++)
	{
		for(j=0;j<q;j++)
		{
			mu[i][j]=0;
			for(k=0;k<p;k++)
			{
				mu[i][j]=mu[i][j]+arr1[i][k]*arr2[k][j];
			}
		}
	}
	
	printf("the multiplied array is:\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<q;j++)
		{
			printf("%d ", mu[i][j]);
		}
		printf("\n");
	}
}
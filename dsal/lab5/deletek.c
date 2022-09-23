#include <stdio.h>
#define MAX 20

int stack[MAX];
int tos = -1; 

int isEmpty(){
	if(tos==-1) 
		return 1;
	return 0;
}

void push(int x){
	stack[++tos] = x;
}

void pop(){
	tos--;
}

void display(){
	printf("array after deletion: ");
	for (int i=0; i<=tos; i++)
	{
		printf("%d ", stack[i]);
	}
}

int del(int arr[MAX], int n, int k){	
	push(arr[0]);
	int count=0;
	for (int i=1; i<n; i++) 
	{
        while (!isEmpty() && stack[tos] < arr[i] && count < k) 
        {                                    
            pop();
            count++;
        }
        push(arr[i]);
	}
	display();
}

int main(){
	int a[MAX], n, k;
	printf("enter number of elements (n): ");
	scanf("%d", &n);
	printf("enter elements to be deleted (k): ");
	scanf("%d", &k);
	printf("enter array elements: \n");
	for(int i=0; i<n; i++)
	{
		scanf("%d", &a[i]);
	}
	del(a, n, k);
	printf("\n");
}
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int i,n;
	char *sports[10];
	char str[100];

	printf("\nenter the number of sports: \n");
	scanf("%d", &n);

	printf("\nenter the names of sports:\n");

	for (i = 0; i < n; i++)
	{
		scanf("%s", str);
		//allocating memory equal to the length of string + 1
		//Last 1 byte to accommodate the ‘\0’

		sports[i] = (char*) calloc(strlen(str)+1, sizeof(char));
		strcpy(sports[i],str);
	}

	printf("\ngiven list of sports: \n");

	for (i = 0; i < n; i++)
		printf("%s\n", sports[i]);
		//Deallocate the dynamic memory

	for (i = 0; i < n; i++)
		free(sports[i]);
		return 0;
}
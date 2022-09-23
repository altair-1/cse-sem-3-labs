#include <stdio.h>
#include <string.h>

void main()
{
    int i=0,tos=-1;
    char str[100],pal[100];
    printf("enter a string \n");
    scanf("%s",str);
    int n=strlen(str);
    
    while(str[i]!='\0')
    {
        tos++;
        pal[tos]=str[n-i-1];
        i++;
    }
    if(strcmp(str,pal)==0)
    {
        printf("palindrome string\n");
    }
    else
    {
        printf("not a palindrome\n");
    }
}
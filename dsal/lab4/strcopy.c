#include <stdio.h>

void copy(char str[], char str1[], int index)
{
    str1[index] = str[index];
    if (str[index] == '\0')
        return;
    copy(str, str1, index + 1);
}

int main()
{
    char str[30], str1[30];
    printf("enter a string: ");
    scanf("%[^\n]s", str);
    copy(str, str1, 0);
    printf("the copied string: %s\n", str1);
    return 0;
}
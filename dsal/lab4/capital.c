#include <stdio.h>
#include <string.h>

char checkCap(char* str)
{
    static int i = 0;
    if (i < strlen(str)) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            return str[i];
        }
        else {
            i = i + 1;
            return checkCap(str);
        }
    }
    else
        return 0;
}

int main()
{
    char str[64];
    char cap;

    printf("enter a string: ");
    scanf("%[^\n]s", str);

    cap = checkCap(str);

    if (cap == 0)
        printf("capital letter is not found in the string\n");
    else
        printf("first capital letter is: %c\n", cap);

    return 0;
}
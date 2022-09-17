#include <stdio.h>

void revSentence();
int main() {
    printf("enter a line of text: ");
    revSentence();
    return 0;
}

void revSentence() {
    char c;
    scanf("%c", &c);
    if (c != '\n') {
        revSentence();
        printf("%c", c);
    }
}

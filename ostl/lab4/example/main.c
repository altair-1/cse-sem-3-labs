#include <stdio.h>
#include "math1.h"

int main() {

	int a,b,sum,diff;
	printf("enter a: ");
	scanf("%d",&a);
	printf("enter b: ");
	scanf("%d",&b);
	sum=add(a,b);
	printf("%d\n",sum);
	diff=sub(a,b);
	printf("%d\n",diff);
}

/* in terminal
ar crv mylib.a add.o sub.o
ls

make
*/

#define MAX 10
#define true 1
#define false 0

// structure definition //

typedef struct
{
	char item[MAX];
	int top;
} stack;

void push(stack *ps,char x);
char pop(stack *ps);
int empty(stack *ps);

// push operation //

void push(stack *ps,char x)
{
	if (ps->top!=MAX-1)
	{
		ps->top++;
		ps->item[ps->top]=x;
	}
}

// pop operation //

char pop(stack *ps)
{
	if(!empty(ps))
	return(ps->item[ps->top--]);
}

// stack empty operation //

int empty(stack *ps)
{
	if (ps->top==-1)
	return(true);
	else
	return(false);
}
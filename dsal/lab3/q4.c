#include<stdio.h>
#include<stdlib.h>

struct DOB
{
	int day;
	int *month;
	int year;
};

struct info
{
	int regNo;
	char *name;
	char address[100];
};

struct clg
{
	char *collName;
	char uniName[100];
};

struct Student
{
	struct DOB *dmy;
	struct info stuInfo ;
	struct clg college ;
};

void readInfo(struct Student *p)
{
	printf("enter date of birth (dd-mm-yyyy): \n");
	scanf("%d %d %d", &(p->dmy->day), p->dmy->month, &(p->dmy->year));
	printf("enter reg_no: ");
	scanf("%d", &p->stuInfo.regNo);
	printf("enter name: ");
	scanf("%s", p->stuInfo.name);
	printf("enter address: ");
	scanf("%s", p->stuInfo.address);
	printf("enter college name: ");
	scanf("%s", p->college.collName);
	printf("enter university name: ");
	scanf("%s", p->college.uniName);
}

void display(struct Student *p){
	printf("date of birth : %d-%d-%d\n", p->dmy->day, *(p->dmy->month), p->dmy->year);
	printf("stu_info :\nreg_no : %d\n",p->stuInfo.regNo);
	printf("name : %s\n",p->stuInfo.name);
	printf("address : %s\n",p->stuInfo.address);
	printf("college name : %s\n", p->college.collName);
	printf("university name : %s\n",p->college.uniName);
}

int main()
{
	struct Student *p;
	p = (struct Student*) malloc (sizeof(struct Student));
	p->dmy = (struct DOB*) malloc (sizeof(struct DOB));
	p->dmy->month = (int*) malloc (sizeof(int));
	p->stuInfo.name = (char *) malloc (sizeof(char));
	p->college.collName = (char *) malloc (sizeof(char));
	readInfo(p);
	display(p);
} 
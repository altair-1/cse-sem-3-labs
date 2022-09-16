#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int day;
    int month;
    int year;
} Date;

typedef struct {
    int houseNo;
    int zipCode;
    char state[50];
} Address;

typedef struct {
    char name[50];
    Date d;
    Address addr;
} Employee;

void read(Employee *e,int n) {
    int i;
    for(i=0;i<n;i++) {
        printf("\nenter employee's first name: ");
        scanf("%s",(e+i)->name);
        printf("enter day of dob: ");
        scanf("%d",&((e+i)->d.day));
        printf("enter month (1-12) of dob: ");
        scanf("%d",&((e+i)->d.month));
        printf("enter year of dob: ");
        scanf("%d",&((e+i)->d.year));
        printf("enter house number: ");
        scanf("%d",&((e+i)->addr.houseNo));
        printf("enter zip code: ");
        scanf("%d",&((e+i)->addr.zipCode));
        printf("enter the state: ");
        scanf("%s",(e+i)->addr.state);
    }
}

void display(Employee *e,int n) {
    int i;
    for(i=0;i<n;i++) {
        printf("\ndetails of employee number %d ",(i+1));
        printf("\nname of employee : %s\nDOB : %d/%d/%d\naddress :\nhouse no. %d, zip code : %d, state : %s",(e+i)->name,(e+i)->d.day,(e+i)->d.month,(e+i)->d.year,(e+i)->addr.houseNo,(e+i)->addr.zipCode,(e+i)->addr.state);
    }
}

int main() {
    
    int n;
    printf("enter number of employees: ");
    scanf("%d",&n);
    Employee * emps;
    emps = (Employee *) malloc(n*sizeof(Employee *));

    read(emps,n);
    display(emps,n);

    return 0;
}
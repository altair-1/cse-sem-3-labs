#include<stdio.h>
#include<stdlib.h>

int main(){
int **mat1, **mat2,**res,i,j,r1,c1,r2,c2;

printf("enter the order of the first matrix: \n");
scanf("%d %d",&r1,&c1);
printf("enter the order of the second matrix: \n");
scanf("%d %d",&r2,&c2);

if(c1!=r2){
    printf("invalid order of matrix");
    exit(EXIT_SUCCESS);
}

mat1 = (int**) malloc(r1*sizeof(int*));

for(i=0;i<c1;i++)
    mat1[i]=(int*)malloc(c1*sizeof(int));

mat2 = (int**) malloc(r2*sizeof(int*));

for(i=0;i<c2;i++)
    mat2[i]=(int*)malloc(c2*sizeof(int));
    res = (int**)calloc(r1,sizeof(int*));

for(i=0;i<c2;i++)
    res[i]=(int*)calloc(c2,sizeof(int));
    
    printf("enter matrix 1 elements: \n");
    for(i=0;i<r1;i++)
        for(j=0;j<c1;j++)
            scanf("%d",&mat1[i][j]);

    printf("enter matrix 2 elements: \n");
    for(i=0;i<r2;i++)
        for(j=0;j<c2;j++)
            scanf("%d",&mat2[i][j]);

            printf("\nentered matrix 1: \n");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++)
                    printf("%d ",mat1[i][j]);
                    printf("\n");
            }

            printf("\nentered matrix 2: \n");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++)
                    printf("%d ",mat2[i][j]);
                    printf("\n");
            }       

            for(i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    res[i][j]=0;
                    for(int k=0;k<c1;k++)
                        res[i][j]+= mat1[i][k]*mat2[k][j];

                }
                printf("\n");
            }

            printf("resultant matrix: \n");
            for(i=0;i<r1;i++){
                printf("\n");
                for(j=0;j<c2;j++)
                    printf("%d\t",res[i][j]);   
            }
    
            printf("\n");
            return 0;
            }
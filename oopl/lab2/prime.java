import java.util.Scanner;

public class prime
{
    
    public static void main(String args[])
    {
        int [] arr;

        int n=0,i=0,j=0;
        boolean flag=true;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        n = sc.nextInt();
        arr=new int[n];

        System.out.println("enter numbers in array: ");
        for(i=0;i< n;i++)
        {
            System.out.print((i+1)+":");
            arr[i]=sc.nextInt();
        }

        System.out.println("given array: ");
        for(i=0;i< n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("prime numbers in the array: ");
        for(i=0;i< n;i++)
        {

            flag=true;
            if(arr[i]>1)
            {
                for(j=2;j< arr[i];j++)
                {
                    if(arr[i]%j==0)
                    {

                        flag=false;
                        break;
                    }
                }
                if(flag==true)
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
}
import java.util.*;
class genArrExchange {
    
    static <T> void exchange(T arr[],int a,int b){
        T temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static <T> void display(T arr[]){
        System.out.print("modified array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. integer array\n2. string array\n3. double array\n");
        int inp = sc.nextInt();
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        System.out.print("enter positions of two different elements to be exchanged\n");
        System.out.print("enter index 1: ");
        int a = sc.nextInt();
        System.out.print("enter index 2: ");
        int b = sc.nextInt();
        if (inp == 1) {
            Integer arr[] = new Integer[n];
            System.out.print("enter integers: \n");
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            exchange(arr,a,b);
            display(arr);
        }
        else if (inp == 2) {
            String arr[] = new String[n];
            System.out.print("enter strings: \n");
            for(int i=0;i<n;i++) {
                arr[i]=sc.next();
            }
            exchange(arr,a,b);
            display(arr);
        }
        else if (inp == 3) {
            Double arr[] = new Double[n];
            System.out.print("enter double values: \n");
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextDouble();
            }
            exchange(arr,a,b);
            display(arr);
        }
        else 
            System.out.println("invalid input");
        sc.close();
    }
}
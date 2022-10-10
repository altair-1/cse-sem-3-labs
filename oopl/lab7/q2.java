import myPackages.p1.maximum;
import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        maximum obj = new maximum();

        System.out.print("find max in: \n1. 3 integers\n2. 3 floating point numbers\n3. array\n4. matrix\n");
        int inp = sc.nextInt();

        switch(inp) {
            case 1: System.out.print("enter first integer: ");
            int a1 = sc.nextInt();
            System.out.print("enter second integer: ");
            int b1 = sc.nextInt();
            System.out.print("enter third integer ");
            int c1 = sc.nextInt();
            int ans1 = obj.max(a1,b1,c1);
            System.out.println("max = "+ans1);
            break;

            case 2:System.out.print("enter first float: ");
            float a2 = sc.nextFloat();
            System.out.print("enter second float: ");
            float b2 = sc.nextFloat();
            System.out.print("enter third float: ");
            float c2 = sc.nextFloat();
            float ans2 = obj.max(a2,b2,c2);
            System.out.println("max = "+ans2);
            break;

            case 3:System.out.print("enter n: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i =0; i<n;i++) {
                System.out.print("enter element no. "+(i+1)+": ");
                arr[i] = sc.nextInt();
            }
            int ans3 = obj.max(arr);
            System.out.println("max = "+ans3);
            break;

            case 4:System.out.print("enter number of rows: ");
            int r = sc.nextInt();
            System.out.print("enter number of columns: ");
            int c = sc.nextInt();
            int mat[][] = new int[r][c];
            for(int i=0;i<r;i++) {
                for(int j = 0;j<c;j++) {
                    System.out.print("enter element at ("+i+","+j+"): ");
                    mat[i][j] = sc.nextInt();
                }
            }
            int ans4 = obj.max(mat);
            System.out.println("max = "+ans4);
            break;

            default:System.out.println("invalid input");
        }
    }
}
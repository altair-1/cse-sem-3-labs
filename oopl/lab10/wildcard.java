import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class wildcard {
    public static void display(List <?> list) {
        for (Object obj: list) {
            System.out.print(obj+" ");
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. integer array, 2. string array, 3. double array\n");
        int inp = sc.nextInt();
        if (inp == 1) {
            List<Integer> arr = Arrays.asList(1,2,3,4);
            display(arr);
        }
        else if (inp == 2) {
            List<String> arr = Arrays.asList("name1","name2","name3","name4");
            display(arr);
        }
        else if (inp == 3) {
            List<Double> arr = Arrays.asList(2.5,1.2,6.65,8.0,7.9);
            display(arr);
        }
        else 
            System.out.println("invalid input");
        sc.close();
    }
}
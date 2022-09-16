import java.util.Scanner;

class counter
{
    static int count = 0;
    
    counter()
    {
        count++;
    }
    
    public static void showCount()
    {
        System.out.println("count = "+count);
    }
}

class q4
{
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of objects to be created: ");
        
        int n = sc.nextInt();
        counter obj[] = new counter[n];
    
        for(int i = 0 ; i < n ; i++)
        {
            obj[i] = new counter();
            obj[i].showCount();
        }
    }
}
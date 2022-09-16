import java.util.Scanner;

class insert
{
	
	public static void main(String[] args)
	{
		
		int n, pos, ele;
		int[] arr;
		arr=new int[20];
		
		System.out.println("enter array size: ");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("enter elements: ");
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("enter element to be inserted: ");
		ele= sc.nextInt();
		
		System.out.println("enter position for insertion: ");
		pos= sc.nextInt();
		
		for(int i =n-1; i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = ele;
        
        System.out.println("after inserting: ");
        
        for(int i = 0; i <=n; i++)
        {
            System.out.println(arr[i]+" ");
        }
        
        System.out.println("\n");
        System.out.println("enter position to be deleted: ");
		pos = sc.nextInt();
		pos=pos-1;
		for (int i = pos; i <=n - 1; i++)
            arr[i] = arr[i + 1];
        n--;
        
        System.out.println("final array: ");
        for (int i = 0; i <= n; i++) 
            System.out.println(arr[i] + " ");
	}
}
import java.util.Scanner;

class bubble
{
	
	public static void main(String[] args)
	{
		
		System.out.println("enter array size: ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		int[] arr1;
		arr1=new int[20];
		
		System.out.println("enter elements: ");
		
		for(int i=0; i<n; i++)
			arr1[i] = sc.nextInt();
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		
		System.out.println("sorted array in ascending order: ");
		for(int i=0; i<n; i++)
			System.out.println(" " + arr1[i]);
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(arr1[j]<arr1[j+1])
				{
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		
		System.out.println("sorted array in descending order: ");
		for(int i=0; i<n; i++)
			System.out.println(" " + arr1[i]);
	}
}
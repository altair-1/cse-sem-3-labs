import java.util.Scanner;

class lsearch
{
	
	public static void main(String[] args)
	{
		
		int i,len, key, array[];
		Scanner sc = new Scanner(System.in);
	 	
	 	System.out.println("enter array length:");
	 	len = sc.nextInt(); 
	 	array = new int[len]; 
	 	
	 	System.out.println("enter " + len + " elements:");
	    
	    for (i = 0; i < len; i++)
	        array[i] = sc.nextInt();
	    
	    System.out.println("enter the value to be found:");
	    key = sc.nextInt();
	    
	    for (i = 0; i < len; i++)
	    {
	        if (array[i]== key) 
	        {
	        	System.out.println(key+" is present at position "+(i+1));
	            break;
	        }
	    }
	    
	    if (i == len)
	    	System.out.println(key + " doesn't exist in array");
   }
}
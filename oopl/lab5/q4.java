import java.util.Scanner;

class q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		String n = sc.next();
		String num = "";
		int c = 0;
		int cc = 0;
		
		for(int i = n.length()-1 ; i >= 0 ; i --)
		{
			char ch = n.charAt(i);
			num = ch + "" + num;
			c++;
		
			if(c%3==0 && (num.length()-cc) < n.length())
			{
    			num = ","+num;
    			cc++;
			}
		}	
		System.out.println("formatted number = " + num);
	}
}
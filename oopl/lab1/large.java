import java.util.Scanner;
class large{
	public static void main(String[] args){
		int a,b,c;
	System.out.println("enter three numbers:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	largest(a,b,c);
}
	static void largest(int a, int b, int c){
		if(a>b && a>c){
	System.out.println(a+" is the largest");
	}
	else if(b>a && b>c){
	System.out.println(b+" is the largest");
	}
	else{
	System.out.println(c+" is the largest");
	}
	}
	}
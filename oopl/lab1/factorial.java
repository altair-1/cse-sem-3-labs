import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		int n,r,ncr;
		System.out.println("enter n and r: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		r=sc.nextInt();
		ncr=fact(n)/(fact(r)*fact(n-r));
		System.out.println("ncr is "+ncr);
	}
	static int fact(int x){
		int fac=1;
		while(x!=1){
			fac=fac*x;
			x--;
		}
		return fac;
	}
}
import java.util.Scanner;
class quad{
	public static void main(String[] args){
		int a,b,c,x;
		double disc,re,im,r1,r2;
		System.out.println("enter a, b and c: ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		disc=(b*b)-(4*a*c);
		if(disc>0){
			x=1;
		}
		else if(disc==0){
			x=2;
		}
		else{
			x=3;
		}
		switch(x){
		case(1):
			r1=(-b+Math.pow(disc,0.5))/(2*a);
			r2=(-b-Math.pow(disc,0.5))/(2*a);
			System.out.println("the roots are "+r1+" and "+r2);
			break;
		case(2):
			r1=-b/(2*a);
			System.out.println("the root is "+r1);
			break;
		case(3):
			re=-b/(2*a);
			im=Math.pow(-disc,0.5)/(2*a);
			System.out.println("the roots are "+re+"+"+im+" and "+re+"-"+im);
			break;
		}
	}
}
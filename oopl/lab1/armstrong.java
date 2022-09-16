import java.util.Scanner;
class armstrong{
	public static void main(String[] args){
		int n;
		System.out.println("enter N: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		isArmstrong(n);
	}
	static void isArmstrong(int num){
		int sum=0,n;
		n=num;
		while(n!=0){
			sum=sum+(int)Math.pow((n%10),3);
			n=n/10;
		}
		if(sum==num){
			System.out.println(num+" is an armstrong number");
		}
		else{
			System.out.println(num+" is not an armstrong number");
		}
	}
}
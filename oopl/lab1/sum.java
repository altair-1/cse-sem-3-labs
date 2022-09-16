import java.util.Scanner;
class sum{
	public static void main(String[] args){
		int n;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		findSum(n);
	}
	static void findSum(int n){
		int sum=0;
		while(n!=0){
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println("The sum is "+sum);
	}
}
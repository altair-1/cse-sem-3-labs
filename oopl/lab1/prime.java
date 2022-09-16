import java.util.Scanner;
class prime{
	public static void main(String[] args){
		int x=2,n,i=0,fl;
		System.out.println("Enter N: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i!=n){
			fl=isPrime(x);
			if(fl==0){
				System.out.print(x+" ");
				i++;
			}
			x++;
		}
	}
	static int isPrime(int x){
		int i,flag=0;
		for(i=2;i<=x/2;i++){
			if(x%i==0){
				flag=1;
				break;
			}
		}
		return flag;
	}
}
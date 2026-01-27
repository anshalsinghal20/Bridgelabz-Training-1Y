import java.util.Scanner;
class SumOfNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int sum = 0;
	int n = sc.nextInt();
	while(n!=0){
	sum = sum+n;
	System.out.print("enter the num = ");
	n = sc.nextInt();
	}
	System.out.println("sum = "+sum);
	}
}
import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int f=sc.nextInt();
	int total=1;
	while(f>0){
	total=total*f;
	f--;
	}
	System.out.println("factorial = "+total);
	}
}
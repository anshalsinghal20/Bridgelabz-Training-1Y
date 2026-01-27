import java.util.Scanner;
class Sum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int sum = 0;
	int n = sc.nextInt();
	while(true){
	sum = sum+n;
	System.out.print("enter the num = ");
	n = sc.nextInt();
	if(n<=0){
	break;
	}
	}
	System.out.println("sum = "+sum);
	}
}
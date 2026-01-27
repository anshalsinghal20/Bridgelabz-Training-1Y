import java.util.Scanner;
class CountDown{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	while(n>0){
	System.out.println(n);
	n--;
	}
	}
}
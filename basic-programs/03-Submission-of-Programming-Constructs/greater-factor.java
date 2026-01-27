import java.util.Scanner;
class GreaterFactor{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	for(int i=n-1;i>=1;i--){
	if(n%i==0){
	System.out.println("greater factor = "+i);
	break;
	}
	}
	}
}
import java.util.Scanner;
class FactorUsingWhile{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	int i=1;
	while(i<=n){
	if(n%i==0){
	System.out.println(i);
	}
	i++;
	}
	}
}
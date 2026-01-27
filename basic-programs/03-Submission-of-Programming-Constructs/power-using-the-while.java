import java.util.Scanner;
class PowerUsingTheWhile{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the base = ");
	int b = sc.nextInt();
	System.out.print("enter the power = ");
	int p = sc.nextInt();
	int a=1;
	if(b<0&&p<0){
	System.out.println("enter the positive num");
	}
	else{
	for(int i=p;i>=1;i--){
	a=a*b;
	}
	System.out.println("answer = "+a);
	}
	}
}
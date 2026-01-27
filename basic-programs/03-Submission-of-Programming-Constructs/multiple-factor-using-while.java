import java.util.Scanner;
class MultipleNumberUsingWhile{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	if(n>=1&&n<100){
	int i=100;
	while(i>=1){
	if(i%n==0){
	System.out.println(i);
	}
	i--;
	}
	}
	else {
	System.out.println("enter the value in the range");
	}
	}
}
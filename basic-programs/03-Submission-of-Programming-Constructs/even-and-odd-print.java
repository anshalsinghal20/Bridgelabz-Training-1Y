import java.util.Scanner;
class OddAndEvenPrint{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	while(n>0){
	if(n%2==0){
	System.out.println("even = "+n);
	}
	else{
	System.out.println("odd = "+n);
	}
	n--;
	}
	}
	}
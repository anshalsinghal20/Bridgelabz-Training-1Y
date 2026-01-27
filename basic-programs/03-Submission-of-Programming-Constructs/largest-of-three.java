import java.util.Scanner;
class LargestOfThree{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the first number = ");
	int a = sc.nextInt();
	System.out.print("enter the second number = ");
	int b = sc.nextInt();
	System.out.print("enter the third number = ");
	int c = sc.nextInt();
	if(a>b&&a>c){
	System.out.println("Is the first number the largest? true ");
	}
	else if(b>a&&b>c){
	System.out.println("Is the second number the largest? true ");
	}
	else{
	System.out.println("Is the third number the largest? true ");
	}
	}
}
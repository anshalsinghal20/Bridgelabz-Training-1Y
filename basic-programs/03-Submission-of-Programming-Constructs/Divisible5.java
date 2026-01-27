import java.util.Scanner;
class Divisible5{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 
	System.out.print("enter the number is = ");
	int n = sc.nextInt();
	if(n%5==0){
	System.out.println("Is the number "+n+" divisible by 5");
	}
	else{
	System.out.println("Is the number not "+n+" divisible by 5");
	}
	}
}
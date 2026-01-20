	import java.util.Scanner;
class Discount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the amount = ");
	double a = sc.nextDouble();
	System.out.print("enter the discount amount = ");
	double da = sc.nextDouble();
	double d = (da/100)*a;
	double fd = a-d;
	System.out.println("The discount amount is INR " +d+ " and final discounted fee is INR " +fd); 
	}
}
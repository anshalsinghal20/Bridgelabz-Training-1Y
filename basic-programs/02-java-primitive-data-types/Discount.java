import java.util.Scanner;
class Discount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the amount = ");
	double a = sc.nextDouble();
	double d = a/10;
	double fd = a-d;
	System.out.println("The discount amount is INR " +d+ " and final discounted fee is INR " +fd);	
	}
}
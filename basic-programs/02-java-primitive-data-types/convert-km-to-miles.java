import java.util.Scanner;
class Convert{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the value of Kilometer = ");
	double k = sc.nextDouble();
	double m = k/1.6;
	System.out.println("The total miles is "+m+" mile for the given km "+k);
	}
	
}
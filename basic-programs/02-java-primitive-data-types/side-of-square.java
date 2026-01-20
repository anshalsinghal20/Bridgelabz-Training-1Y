import java.util.Scanner;
class SideOfSquare{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the perimeter of square = ");
	double p = sc.nextDouble();
	double s = p/4.0;
	System.out.println("The length of the side is "+s+" whose perimeter is "+p);
	}
}
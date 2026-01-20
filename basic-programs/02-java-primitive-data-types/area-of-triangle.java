import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the height of triangle in inches = ");
	double h = sc.nextDouble();
	System.out.print("enter the base of triangle in inches = ");
	double b = sc.nextDouble();
	double ai = (1.0/2.0)*b*h;
	h=h*2.54;
	b=b*2.54;
	double ac= (1.0/2.0)*b*h;
	System.out.println("area of a triangle in square inches is " +ai+ " and square centimeters is "+ac);
	}
}
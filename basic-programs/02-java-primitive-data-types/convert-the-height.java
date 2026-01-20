import java.util.Scanner;
class ConvertHeight{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the value of height in centimeters = ");
	double h = sc.nextDouble();
	double hi = h/2.54;
	double hf = hi/12;
	System.out.println("Your Height in cm is "+h+" while in feet is "+hf+" and inches is "+hi);
	}
}
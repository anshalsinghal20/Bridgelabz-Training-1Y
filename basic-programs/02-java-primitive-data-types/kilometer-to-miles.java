import java.util.Scanner;
class KilometerToMiles{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the value of kilomater = ");
	double k=sc.nextDouble();
	double m=k*1.6;
	System.out.println("The distance " +k+ "km in miles is "+m);
	}
}

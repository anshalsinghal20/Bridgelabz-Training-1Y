import java.util.Scanner;
class ConvertDistance{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the distance in feets = ");
	double d = sc.nextDouble();
	double y = d/3;
	double m = y/1760;
	System.out.println("the distance in yards is "+y+" and miles is "+m);
	}
	
}
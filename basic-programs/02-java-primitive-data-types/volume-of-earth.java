import java.util.Scanner;
class VolumeOfEarth{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the radius of earth in Kilometer = ");
	double r = sc.nextDouble();
	double pi = Math.PI;
	double vkm = (4.0/3.0)*pi*r*r*r;
	r = r*0.621371;
	double vm = (4.0/3.0)*pi*r*r*r;
	System.out.println("The volume of earth in cubic kilometers is "+vkm+" and cubic miles is "+vm);
	}
}
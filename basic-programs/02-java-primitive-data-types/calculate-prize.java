import java.util.Scanner;
class PrizeCalculate{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the unitprize is = ");
	double p = sc.nextDouble();
	System.out.print("enter the quantity to be bought = ");
	double b = sc.nextDouble();
	double tp = p*b;
	System.out.println("The total purchase price is INR "+tp+" if the quantity "+b+" and unit price is INR "+p);
	}
}
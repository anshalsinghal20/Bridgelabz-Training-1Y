import java.util.Scanner;
class ProfitAndLoss{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the cost prize = ");
	double c=sc.nextDouble();
	System.out.print("enter the selling prize = ");
	double s=sc.nextDouble();
	System.out.println("The Cost Price is INR " +c+ " and Selling Price is INR "+s);
	if(c<s){
		double p=s-c;
		double pp=(p/c)*100;
		System.out.println("The Profit is INR "+p+ " and the Profit Percentage is "+pp);
	}
	else if(s<c){
		double l=c-s;
		double lp=(l/c)*100;
		System.out.println("The loss is INR "+l+ " and the loss Percentage is "+lp);
	}
	}
}
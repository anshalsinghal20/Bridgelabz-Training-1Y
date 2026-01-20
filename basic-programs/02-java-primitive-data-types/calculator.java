import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the first no. = ");
	double f = sc.nextDouble();
	System.out.print("enter the second no. = ");
	double s = sc.nextDouble();
	double add = f+s;
	double sub = f-s;
	double mult =  f*s;
	double div = f/s;
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+f+" and "+s+" is " +add+ " , "+sub+" , "+mult+" and "+div);
 
	}
}

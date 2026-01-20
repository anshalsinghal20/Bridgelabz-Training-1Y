import java.util.Scanner;
class PenDistibute{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number of pens = ");
	int p=sc.nextInt();
	int ps=p/3;
	int re=p%3;
	System.out.println("The Pen Per Student is "+ps+ " and the remaining pen not distributed is "+re);
	}
}
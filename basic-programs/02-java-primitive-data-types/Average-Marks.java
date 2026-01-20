import java.util.Scanner;
class AverageMarks{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the marks of maths = ");
	double m=sc.nextDouble();
	System.out.print("enter the marks of physics = ");
	double p=sc.nextDouble();
	System.out.print("enter the marks of chemistry = ");
	double c=sc.nextDouble();
	double a=(m+p+c)/3;
	System.out.println("sam's average marks in PCM = "+a);
	}
}
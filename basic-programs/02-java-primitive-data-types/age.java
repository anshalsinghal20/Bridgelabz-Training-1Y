import java.util.Scanner;
class Age{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the birth date of harry : ");
	int a=sc.nextInt();
	int age=2024-a;
	System.out.println("Harry's age in 2024 is = "+age);
	}
}
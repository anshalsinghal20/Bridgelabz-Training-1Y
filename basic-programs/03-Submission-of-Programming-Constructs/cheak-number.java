import java.util.Scanner;
class CheakNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	if(n>0){
	System.out.println("positive");
	}
	else if(n<0){
	System.out.println("negative");
	}
	else{
	System.out.print("zero");
	}
	 }
	}
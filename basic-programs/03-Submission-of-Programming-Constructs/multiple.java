import java.util.Scanner;
class Multiple{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num = ");
	int n = sc.nextInt();
	for(int i=6;i<=9;i++){
	System.out.println(n+"*"+i+"="+i*n);
	}
	}
}
import java.util.Scanner;
class EmployeeBonus{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the employee = ");
	int e=sc.nextInt();
	int s[]=new int[e];
	int y[]=new int[e];
	double ns[]=new double[e];
	double b[]=new double[e];
	double ts=0.0;
	double tb=0.0;
	double tns=0.0;
	for(int i=0;i<e;i++){
	System.out.print("employe "+(i+1));
	System.out.print(" salary: ");
	s[i]=sc.nextInt();
	System.out.print("year: ");
	y[i]=sc.nextInt();
	ts=ts+s[i];
	if(y[i]>5){
	b[i]=s[i]*0.05;
	}
	else{
	b[i]=s[i]*0.02;
	}
	tb=tb+b[i];
	ns[i]=s[i]+b[i];
	tns=tns+ns[i];
	}
	for(int i=0;i<e;i++){
	System.out.print("empolye: "+(i+1)+" salary: "+s[i]+" bonus: "+b[i]+" new salary: "+ns[i]);
	System.out.println();
	}
	System.out.println("total salary: "+ts);
	System.out.print("total bonus: "+tb);
	System.out.print("total new salary: "+tns);
	}
}
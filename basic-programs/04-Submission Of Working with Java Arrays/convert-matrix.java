import java.util.Scanner;
class ConvertMatrix{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the row = ");
	int r=sc.nextInt();
	System.out.print("enter the column = ");
	int c=sc.nextInt();
	int m1[][]=new int[r][c];
	int m2[]=new int[r*c];
	int k=0;
	System.out.println("enter the matrix ");
	for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
	m1[i][j]=sc.nextInt();
	m2[k]=m1[i][j];
	k++;
	}
	}
	System.out.println("matrix is ");
	for(int i=0;i<k;i++){
	System.out.print(m2[i]+" ");
	}
	}
}
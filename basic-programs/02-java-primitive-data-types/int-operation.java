import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;
		System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + r1);
        System.out.println("a * b + c = " + r2);
        System.out.println("c + a / b = " + r3);
        System.out.println("a % b + c = " + r4);
		}
	}

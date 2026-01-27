import java.util.Scanner;

class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int k=0;
        if (num <= 1) {
            System.out.println("enter the vald number");
        } 
		else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    k=1;
                    break;
                }
            }
        }

        if (k==0) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}

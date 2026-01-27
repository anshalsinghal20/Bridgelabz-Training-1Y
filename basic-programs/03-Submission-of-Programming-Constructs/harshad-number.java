import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;               
        int o = n; 
        while (o != 0) {
            int digit = o % 10;
            sum = sum + digit;
            o = o / 10;
        }
        if (sum != 0 && n % sum == 0) {
            System.out.println(n + " is a Harshad Number");
        } else {
            System.out.println(n + " is not a Harshad Number");
        }
    }
}

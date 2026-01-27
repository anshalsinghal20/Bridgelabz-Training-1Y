import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula   = " + sumFormula);
            if (sum == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("The results are NOT equal.");
            }
        }
    }
}

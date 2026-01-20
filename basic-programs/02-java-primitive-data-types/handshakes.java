import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int s = sc.nextInt();
        int h = (s*(s-1))/2;
        System.out.println("The maximum number of possible handshakes is " + h);
    }
}

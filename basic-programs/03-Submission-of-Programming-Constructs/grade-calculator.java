import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int p = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int c = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int m = sc.nextInt();
        int total = p + c + m;
        double percentage = total / 3.0;
        System.out.println("Average Percentage = " + percentage);
        if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Level 4, above agency-normalized standards");
        } 
        else if (percentage >= 70) {
            System.out.println("Grade: B");
            System.out.println("Level 3, at agency-normalized standards");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade: C");
            System.out.println("Level 2, below but approaching agency-normalized standards");
        } 
        else if (percentage >= 50) {
            System.out.println("Grade: D");
            System.out.println("Level 1, well below agency-normalized standards");
        } 
        else if (percentage >= 40) {
            System.out.println("Grade: E");
            System.out.println("Level 1, too below agency-normalized standards");
        } 
        else {
            System.out.println("Grade: R");
            System.out.println("Remedial standards");
        }
    }
}

import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double w = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double h = sc.nextDouble();
        double heightM = h / 100;
        double bmi = w / (heightM * heightM);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } 
        else if (bmi >= 25 && bmi < 40) {
            System.out.println("Weight Status: Overweight");
        } 
        else {
            System.out.println("Weight Status: Obese");
        }
    }
}

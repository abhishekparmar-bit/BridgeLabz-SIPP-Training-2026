import java.util.Scanner;

public class fitness_tracker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

    }
}
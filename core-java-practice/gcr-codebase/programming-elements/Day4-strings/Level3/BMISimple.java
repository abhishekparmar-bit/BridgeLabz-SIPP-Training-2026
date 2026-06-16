import java.util.Scanner;

public class BMISimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // weight, height

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Weight (kg) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Output
        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100; // convert cm to m
            double bmi = w / (h*h);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            System.out.printf("%d\t%.1f\t%.1f\t%.2f\t%s\n",
                    (i+1), w, data[i][1], bmi, status);
        }
    }
}

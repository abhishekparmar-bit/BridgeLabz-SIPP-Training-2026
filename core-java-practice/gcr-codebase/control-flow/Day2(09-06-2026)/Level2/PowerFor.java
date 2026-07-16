import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        if (exponent < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer for the exponent.");
            return;
        }

        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}

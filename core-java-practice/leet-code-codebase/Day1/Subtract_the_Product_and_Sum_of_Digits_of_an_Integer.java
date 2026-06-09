import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {

    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            sum += digit;
            n /= 10;
        }

        return prod - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = subtractProductAndSum(n);

        System.out.println("Result = " + result);

        sc.close();
    }
}
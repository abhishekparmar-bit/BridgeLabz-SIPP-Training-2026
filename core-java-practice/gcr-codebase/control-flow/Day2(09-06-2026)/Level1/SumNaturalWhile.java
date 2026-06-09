import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("While Loop Sum = " + sumWhile);
            System.out.println("Formula Sum = " + sumFormula);
            System.out.println("Both are equal: " +
                    (sumWhile == sumFormula));
        } else {
            System.out.println("Not a natural number");
        }

        sc.close();
    }
}
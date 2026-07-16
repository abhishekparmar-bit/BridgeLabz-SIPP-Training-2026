import java.util.*;

public class HarshadChecker {
    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = storeDigits(num);

        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad? " + isHarshad(num, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] row : freq) if (row[1] > 0)
            System.out.println(row[0] + " -> " + row[1]);
    }
}

import java.util.Scanner;

public class RomanToInt {

    public static int romanToInt(String s) {
        int ans = 0;
        int[] roman = new int[128];

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        for (int i = 0; i + 1 < s.length(); i++) {
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
                ans -= roman[s.charAt(i)];
            } else {
                ans += roman[s.charAt(i)];
            }
        }

        return ans + roman[s.charAt(s.length() - 1)];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String s = sc.nextLine();

        int result = romanToInt(s);

        System.out.println("Integer value = " + result);

        sc.close();
    }
}
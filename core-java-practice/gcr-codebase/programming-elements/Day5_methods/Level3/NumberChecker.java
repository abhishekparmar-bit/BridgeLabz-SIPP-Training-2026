public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        int num = 0;
        for (int d : digits) num = num * 10 + d;
        return sum == num;
    }

    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2) min2 = d;
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = storeDigits(num);

        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Duck? " + isDuck(digits));
        System.out.println("Armstrong? " + isArmstrong(digits));
        System.out.println("Largest two: " + java.util.Arrays.toString(largestTwo(digits)));
        System.out.println("Smallest two: " + java.util.Arrays.toString(smallestTwo(digits)));
    }
}

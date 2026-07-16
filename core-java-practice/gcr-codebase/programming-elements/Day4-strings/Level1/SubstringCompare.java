import java.util.Scanner;

public class SubstringCompare {
    // Method to create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subCharAt = substringUsingCharAt(text, start, end);
        String subBuiltIn = text.substring(start, end);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Comparison result: " + compareStrings(subCharAt, subBuiltIn));
    }
}

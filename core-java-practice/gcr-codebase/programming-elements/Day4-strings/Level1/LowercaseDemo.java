import java.util.Scanner;

public class LowercaseDemo {
    // Method to convert text manually to lowercase using ASCII difference
    public static String toLowerManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32)); // convert uppercase to lowercase
            } else {
                sb.append(c); // keep as is
            }
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
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
        String text = sc.nextLine();

        String manualLower = toLowerManual(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Comparison result: " + compareStrings(manualLower, builtInLower));
    }
}

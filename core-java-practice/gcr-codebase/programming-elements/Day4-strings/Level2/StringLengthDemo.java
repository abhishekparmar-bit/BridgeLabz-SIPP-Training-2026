import java.util.Scanner;

public class StringLengthDemo {
    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index is invalid
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int manualLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
    }
}

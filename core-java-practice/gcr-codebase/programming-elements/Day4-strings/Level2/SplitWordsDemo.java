import java.util.Scanner;

public class SplitWordsDemo {
    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    // Method to split text into words manually
    public static String[] splitManual(String text) {
        int len = findLength(text);
        int wordCount = 1; // at least one word
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start, len);
        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manualSplit = splitManual(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Manual split:");
        for (String w : manualSplit) System.out.println(w);

        System.out.println("Built-in split:");
        for (String w : builtInSplit) System.out.println(w);

        System.out.println("Comparison result: " + compareArrays(manualSplit, builtInSplit));
    }
}


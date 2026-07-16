public class ShortestLongestWord {
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

    public static String[] splitManual(String text) {
        int len = findLength(text);
        int wordCount = 1;
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

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (findLength(w) < findLength(shortest)) shortest = w;
            if (findLength(w) > findLength(longest)) longest = w;
        }
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitManual(text);
        findShortestLongest(words);
    }
}

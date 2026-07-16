import java.util.*;

public class FootballTeam {
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        return Arrays.stream(heights).min().getAsInt();
    }

    public static int tallestHeight(int[] heights) {
        return Arrays.stream(heights).max().getAsInt();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
        }
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + shortestHeight(heights));
        System.out.println("Tallest: " + tallestHeight(heights));
        System.out.println("Mean: " + meanHeight(heights));
    }
}

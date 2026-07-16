import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i=0; i<n; i++) ages[i] = rand.nextInt(90); // random age 0-89
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i=0; i<ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i]>=18) result[i][1] = "Can Vote";
            else result[i][1] = "Cannot Vote";
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tEligibility");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkEligibility(ages);
        display(result);
    }
}

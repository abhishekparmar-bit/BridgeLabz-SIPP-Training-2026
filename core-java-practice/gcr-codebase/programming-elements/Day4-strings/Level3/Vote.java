import java.util.Random;

public class Vote {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ages = new int[10];

        // Random ages for 10 students
        for (int i = 0; i < 10; i++) {
            ages[i] = rand.nextInt(90); // 0–89
        }

        // Display eligibility
        System.out.println("Student\tAge\tEligibility");
        for (int i = 0; i < 10; i++) {
            String status = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
            System.out.println((i+1) + "\t" + ages[i] + "\t" + status);
        }
    }
}

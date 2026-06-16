import java.util.Random;

public class StudentScoreCard {
    // Generate random scores for Physics, Chemistry, Math
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Math
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;       // round to 2 decimals
            result[i][2] = Math.round(perc * 100.0) / 100.0;      // round to 2 decimals
        }
        return result;
    }

    // Assign grades based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 90) grades[i] = "A+";
            else if (perc >= 75) grades[i] = "A";
            else if (perc >= 60) grades[i] = "B";
            else if (perc >= 40) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    // Display neatly in tabular format
    public static void display(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-8s%-10s%-12s%-10s%-10s%-10s%-10s%-8s%n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d%-10d%-12d%-10d%-10.0f%-10.2f%-10.2f%-8s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5); // 5 students
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        display(scores, results, grades);
    }
}

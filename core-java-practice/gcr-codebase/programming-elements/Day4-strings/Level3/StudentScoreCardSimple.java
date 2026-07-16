import java.util.Random;

public class StudentScoreCardSimple {
    public static void main(String[] args) {
        Random rand = new Random();
        int students = 5;

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tPerc\tGrade");
        for (int i = 1; i <= students; i++) {
            int phy = rand.nextInt(100);
            int chem = rand.nextInt(100);
            int math = rand.nextInt(100);

            int total = phy + chem + math;
            double perc = total / 3.0;

            String grade;
            if (perc >= 90) grade = "A+";
            else if (perc >= 75) grade = "A";
            else if (perc >= 60) grade = "B";
            else if (perc >= 40) grade = "C";
            else grade = "F";

            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
                    i, phy, chem, math, total, perc, grade);
        }
    }
}

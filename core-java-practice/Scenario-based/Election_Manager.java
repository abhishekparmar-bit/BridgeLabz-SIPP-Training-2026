import java.util.Scanner;

public class Election_Manager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("Enter voter age (or -1 to exit): ");
            int age = scanner.nextInt();

            if (age == -1) {
                break;
            }
            if (age >= 18) {

                System.out.println("Eligible to vote");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter your vote (1, 2, or 3): ");
                int vote = scanner.nextInt();

                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        System.out.println("Vote recorded for Candidate A");
                        break;

                    case 2:
                        candidate2Votes++;
                        System.out.println("Vote recorded for Candidate B");
                        break;

                    case 3:
                        candidate3Votes++;
                        System.out.println("Vote recorded for Candidate C");
                        break;

                    default:
                        System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("Not eligible to vote.");
            }

            System.out.println();
        }
        System.out.println("Candidate A: " + candidate1Votes + " votes");
        System.out.println("Candidate B: " + candidate2Votes + " votes");
        System.out.println("Candidate C: " + candidate3Votes + " votes");

    }
}
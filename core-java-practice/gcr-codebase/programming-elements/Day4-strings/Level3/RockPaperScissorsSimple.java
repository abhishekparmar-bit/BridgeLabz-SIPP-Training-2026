import java.util.Scanner;

public class RockPaperScissorsSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Game " + i + " - Enter (rock/paper/scissors): ");
            String player = sc.next();
            String[] choices = {"rock","paper","scissors"};
            String comp = choices[(int)(Math.random()*3)];

            String winner;
            if (player.equals(comp)) winner = "Draw";
            else if ((player.equals("rock") && comp.equals("scissors")) ||
                     (player.equals("paper") && comp.equals("rock")) ||
                     (player.equals("scissors") && comp.equals("paper"))) {
                winner = "Player"; playerWins++;
            } else { winner = "Computer"; compWins++; }

            System.out.println("Computer chose: " + comp + " | Winner: " + winner);
        }

        System.out.println("\nPlayer Wins: " + playerWins);
        System.out.println("Computer Wins: " + compWins);
    }
}


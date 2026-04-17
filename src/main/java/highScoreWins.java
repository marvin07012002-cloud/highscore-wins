import java.sql.SQLOutput;
import java.util.Scanner;
public class highScoreWins {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + teams[0]);
        }else {
            System.out.println("Winner: " + teams[1]);
        }
    }
}

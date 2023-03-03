import java.util.Scanner;

public class ifElseCondLogicChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;

        int user_score;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");
        user_score = num.nextInt();

        int score = 4555;
        int levelCompleted = 5;
        int bonus = 100;

        if ((user_score > 5000) && (user_score < 10000 )) {
            System.out.println("Your score is " + score);
        } else {
            System.out.println("Score wasn't high enough");
        }


    }
}

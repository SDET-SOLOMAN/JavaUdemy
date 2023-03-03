import java.util.Scanner;

public class creatingMethods {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");
        score = num.nextInt();
        int finalScore = score;

        if ((score > 5000) && (score < 10000 )) {
            return finalScore + 35;
        } else if ((score < 5000) && (bonus > 50) && (levelCompleted > 5)) {
            return finalScore + 55;
        } else {
            return finalScore + 45;
        }
    }

    public static void main(String[] args) {

        System.out.println(calculateScore(true, 50, 6, 55));


    }
}

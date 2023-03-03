import java.util.Scanner;

public class methodChallenge {

    public static void displayHighScorePosition(String name) {
        System.out.println(name + " managed to get into position " + myScore());
    }

    public static int myScore(){
        int score;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число: ");
        score = num.nextInt();
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } return 4;
    }
    public static void main(String[] args) {
        displayHighScorePosition("James");
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long myKm;

        if (kilometersPerHour < 0) {
            myKm = -1;
        } else {
            myKm = Math.round(kilometersPerHour / 1.609D);
        } return myKm;
    }

    public static void printConversion(double kilometersPerHour) {

        String message = kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h";

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(message);
        }
    }
}

public class mySwitch {

    // can use on byte, short, int, char, Byte, Short Integer, Character, String, enum
    // can't use on long, float, double, or bool or their wrappers
    public static void main(String[] args) {
        int numOne = 6;

        switch (numOne) {
            case 3 -> System.out.println("Sup" + 3);
            case 4, 5, 6 -> System.out.println("Sup 5");
            default -> System.out.println('N');
        }

        justOldSwicthc("Gandon");
        System.out.println(getQuarter("James"));
        dayOfWeek(5);
        printNumberInWord(7);
    }

    public static String getQuarter(String month) {
        return switch(month) {
            case "January", "February", "March" -> "1st qr " + month;
            case "April", "May", "June" -> "2nd qr " + month;
            case "July", "August", "September" -> "3rd qr " + month;
            case "October", "Novermber", "December" -> "4th qr " + month;
            default -> {
                String errorName = "Bad " + month;
                yield errorName;
            }
        };
    }

    public static void justOldSwicthc(String name) {
        switch (name) {
            case "James":
                System.out.println("His name is James");
                break;
            case "Steve":
                System.out.println("Name is Steve");
                break;
            default:
                System.out.println("Name is not here");
                break;
        }
    }

    public static void dayOfWeek(int num) {

        String dayOfTheWeek = switch (num) {

            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(num + " stands for " + dayOfTheWeek);
    }

    public static void printNumberInWord(int number) {
        String num = switch(number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(num);
    }
}

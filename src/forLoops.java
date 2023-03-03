public class forLoops {

    // for (init, expression, increment)

    public static void main(String[] args) {


        for(int counter = 1; counter <= 10; counter += 2) {
            System.out.println(counter);
        }

        for(double num = 2; num <= 4; num ++) {

            System.out.println("At the interest of " + num + "% the ammount of " + 1000 + " would be " +
                    calculateInterest(1000, num));

        }

        for(double num = 7.5; num <= 10; num += .25) {

            System.out.println("At the interest of " + num + "% the ammount of " + 1000 + " would be " +
                    calculateInterest(100, num));
        }


        System.out.println("2 is " + (isPrime(2) ? "" : "NOT") + " a prime number");
        System.out.println("4 is " + (isPrime(4) ? "" : "NOT") + " a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT") + " a prime number");
        System.out.println("23 is " + (isPrime(23) ? "" : "NOT") + " a prime number");
        System.out.println("5 is " + (isPrime(5) ? "" : "NOT") + " a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT") + " a prime number");

    }

    public static boolean isPrime(int myNum) {
        if (myNum <= 2) {
            return (myNum == 2);
        }
        for(int num = 2; num < myNum; num ++ ) {

            if (myNum % num == 0) {
                return false;
            }
        } return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}

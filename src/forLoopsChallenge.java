public class forLoopsChallenge {
    public static void main(String[] args) {
        System.out.println(primeNumCounter(100));
    }

    public static int primeNumCounter(int num) {

        int counting = 0;

        for(int n = 2; n < num; n ++) {
            if (num % n != 0) {
                System.out.println("This is a prime number " + n);
                counting += 1;
            }
            if (counting > 3) {
                break;
            }
        } return counting;

    }


}

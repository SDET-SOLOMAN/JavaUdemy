public class minAndMaxOfVariables {
    public static void main(String[] args) {

        // Primitive Data Type:

        // Whole: byte, short, int, long

        byte a = Byte.MAX_VALUE;
        byte b = Byte.MIN_VALUE;
        System.out.println("Byte min value is " + b + " and byte max value is " + a);
        System.out.println("Byte has width of " + Byte.SIZE);

        short aa = Short.MAX_VALUE;
        short bb = Short.MIN_VALUE;
        System.out.println("Short min value is " + bb + " and short max value is " + aa);
        System.out.println("Short has width of " + Short.SIZE);

        int aaa = Integer.MAX_VALUE;
        int bbb = Integer.MIN_VALUE;
        System.out.println("Integer min value is " + bbb + " and integer max value is " + aaa);
        System.out.println("Integer has width of " + Integer.SIZE);

        long aaaa = Long.MAX_VALUE;
        long bbbb = Long.MIN_VALUE;
        System.out.println("Long min value is " + bbbb + " and Long max value is " + aaaa);
        System.out.println("Long has width of " + Long.SIZE);

        // Floating point: float and double

        float flMax = Float.MAX_VALUE;
        float flMin = Float.MIN_VALUE;
        System.out.println("Float min value is " + flMin + " and Float max value is " + flMax);
        System.out.println("FLoat has width of " + Float.SIZE);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("Double min value is " + doubleMin + " and Double max value is " + doubleMax);
        System.out.println("Double has width of " + Double.SIZE);

        // Single Character: char

        char charMax = Character.MAX_VALUE;
        char charMin = Character.MIN_VALUE;
        System.out.println("Char min value is " + charMin + " and Char max value is " + charMax);
        System.out.println("Char has width of " + Character.SIZE);

        //Boolean value: boolean
    }
}
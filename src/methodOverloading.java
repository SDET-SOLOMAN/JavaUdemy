public class methodOverloading {

    public static void main(String[] args) {

        System.out.println(convertToCM(6, 4));
        System.out.println(getDurationString(-9));

    }

    public static double convertToCM(int height) {
        return ((double)height) * 2.54;
    }

    public static double convertToCM(int ft, int inch){

        int myInch = (ft * 12) + inch;
        return convertToCM(myInch);
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds);
        } else {
            return "Must be greater than 0";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours;
        hours = minutes / 60;
        minutes = minutes % 60;
        seconds = seconds % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }



}

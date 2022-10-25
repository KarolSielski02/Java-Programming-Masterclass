public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(15902165, 25));
        System.out.println(getDurationString(595596594));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes %= 60;
        return (hours + "h " + minutes + "m " + seconds + "s");
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
}
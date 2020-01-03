package pl.pawtel.expressions_statements_methods.seconds_and_minutes;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        String test = getDurationString(5L, 5L);
        System.out.println(test);
        String test2 = getDurationString(3945L);
        System.out.println(test2);
    }

    public static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || (seconds < 0 || seconds > 59))
            return INVALID_VALUE_MESSAGE;

        long hours = minutes / 60;
        minutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + "";
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0)
            return INVALID_VALUE_MESSAGE;

        long minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}

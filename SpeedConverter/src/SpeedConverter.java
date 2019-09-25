public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);

    }


    public static void printConversion(double kilometersPerHour) {

        long calculation = toMilesPerHour(kilometersPerHour);

        if (calculation == -1) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + calculation + " mi/h");
        }


    }
}
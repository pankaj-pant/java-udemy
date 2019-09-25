public class FeetandInches {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0) {
            return -1;
        } else if (inches < 0 || inches > 12) {
            return -1;
        } else {
            return (double) (((feet * 12) + inches) * 2.54);
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        int feet;
        int remainderInches;
        if (inches < 0) {
            return -1;
        } else {
            feet = inches / 12;
            remainderInches = inches - (feet * 12);
            return calcFeetAndInchesToCentimeters(feet, remainderInches);
        }
    }
}

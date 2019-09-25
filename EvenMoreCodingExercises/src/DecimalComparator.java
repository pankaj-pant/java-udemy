public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble){
        firstDouble = firstDouble * 1000;
        secondDouble = secondDouble * 1000;

        if ((int)firstDouble == (int) secondDouble) {
            return true;
        } else {
            return false;
        }
    }

}

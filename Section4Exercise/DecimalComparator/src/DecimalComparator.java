public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstCheck = (int) (firstNumber * 1000);
        int secondCheck = (int) (secondNumber * 1000);

        if ((firstCheck - secondCheck) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

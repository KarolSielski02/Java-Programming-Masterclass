public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int selectedNumber;

        while (number > 1) {
            selectedNumber = number % 10;

            if (selectedNumber % 2 == 1) {
                number /= 10;
                continue;
            }
            number /= 10;
            sum += selectedNumber;
        }
        return sum;
    }
}
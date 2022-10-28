public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPerfectNumber(int num1) {

        if (num1 < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; num1 > i; i++) {
            if (num1 % i == 0) {
                sum += i;
            }
        }
        return sum == num1;

    }
}
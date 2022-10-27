public class Main {

    public static void main(String[] args) {
        System.out.println("10,000$ at 2% interest = " + calculateInterest(10000.0, 2.0) + "$");


        for (int i = 0; i < 6; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (double i = 2.0; i <= 8; i++) {
            System.out.println("10,000$ at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)) + "$");
        }
        for (double i = 8.0; i >= 2; i--) {
            System.out.println("10,000$ at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)) + "$");
        }
        int numbersOfPrime = 0;
        for (int i=432; i<=10000; i++){
            if (isPrime(i)){
                System.out.println(i);
                numbersOfPrime++;
            }
            if (numbersOfPrime == 3){
                break;
            }

        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
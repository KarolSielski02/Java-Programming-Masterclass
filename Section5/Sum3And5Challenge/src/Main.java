public class Main {

    public static void main(String[] args) {

        int amountOfNumbers = 0;
        int sumOFNumbers = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sumOFNumbers += i;
                amountOfNumbers++;
                System.out.println("Found number = " + i);
                System.out.println("Current sum = " + sumOFNumbers);
            }

            if (amountOfNumbers == 5) {
                System.out.println("Sum = " + sumOFNumbers);
                break;
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int theBiggest = 0;
        int theSmallest = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (count == 0) {
                    theBiggest = number;
                    theSmallest = number;
                    count++;
                }

                if (theBiggest < number) {
                    theBiggest = number;
                }

                if (theSmallest > number) {
                    theSmallest = number;
                }

            } else {
                System.out.println("The Biggest was: " + theBiggest + " and the Smallest: " + theSmallest);
                break;
            }
        }
        scanner.close();
    }
}
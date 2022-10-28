public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 1; i < 7; i++){
//            System.out.println("Count value is " + i);
//        }
//
//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count != 7);

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            sum += number;

            if (count == 5) {
                System.out.println("Sum of numbers = " + sum);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
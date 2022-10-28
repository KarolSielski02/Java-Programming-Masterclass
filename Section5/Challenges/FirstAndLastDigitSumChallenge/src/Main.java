public class Main {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(4329));
    }


    public static int sumFirstAndLastDigit(int number) {

        if (number < 0){
            return -1;
        }

        int sum = (number % 10);
        while (number > 9) {
            number /= 10;
        }
        sum += number;
        return sum;
    }
}
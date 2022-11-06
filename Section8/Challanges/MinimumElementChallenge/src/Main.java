import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] returnedArray = readElements(readInteger());
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin(returnedArray);
        System.out.println("Min value is: " + returnedMin);

        scanner.close();
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        return capacity;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give " + count + " numbers");
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Im at 'i' = " + i + "\r");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {

        int smallest = array[0];
        boolean flag = true;


        for (int i = 0; i < array.length - 1; i++) {
            if (smallest > array[i + 1]) {
                smallest = array[i + 1];
            }
        }

        return smallest;
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(array));
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int size = array.length - 1;
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[size];
            array[size] = temp;
            size--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
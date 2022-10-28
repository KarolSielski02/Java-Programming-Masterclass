public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo){

        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99){
            return false;
        }
        return ((numberOne/10 == numberTwo/10)||(numberOne/10 == numberOne % 10)||(numberTwo/10 == numberOne % 10)||(numberOne%10 == numberTwo%10));
    }
}
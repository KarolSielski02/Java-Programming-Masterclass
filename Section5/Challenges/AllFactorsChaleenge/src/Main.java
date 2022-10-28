public class Main {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int num1){

        if (num1 < 0){
            System.out.println("Invalid Value");
        }

        for (int i = 1; num1 >= i; i++){
            if (num1 % i == 0){
                System.out.println(i);
            }
        }
    }
}
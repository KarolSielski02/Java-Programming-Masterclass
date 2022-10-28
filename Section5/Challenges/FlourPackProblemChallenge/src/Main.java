public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount * 5) < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        while (bigCount > 0 && goal >= 5){
            goal -=5;
            bigCount--;
        }
        return smallCount >= goal;
    }
}
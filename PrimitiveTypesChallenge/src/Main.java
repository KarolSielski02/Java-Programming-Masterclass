public class Main {
    public static void main(String[] args) {

        byte challengeByte = 122;
        short challengeShort = 1444;
        int challengeInt = 123596;

        long challengeLong = 50000L + (10L * (challengeByte + challengeShort + challengeInt));
        System.out.println(challengeLong);
    }
}
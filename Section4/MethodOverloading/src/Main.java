public class Main {

    public static void main(String[] args) {
        int newScore = calculatorScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculatorScore(75);
        calculatorScore();

        System.out.println(calcFeetAndInchesToCentimeters(58) + "cm");
    }

    public static int calculatorScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculatorScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculatorScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    //exercise
    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {

        if (feet >= 0 && (inch >= 0 && inch <= 12)) {
            return ((feet * 12) + inch) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {

        double feet = 0;

        if (inch >= 0) {
            if (inch > 12) {
                feet = (int) inch / 12;
            }
            return calcFeetAndInchesToCentimeters(feet, inch %12);
        }
        return -1;
    }
}
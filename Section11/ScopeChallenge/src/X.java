import java.util.Scanner;

public class X {
    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        this.x = x.nextInt();
        x();
    }
    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " * " + x + " = " + this.x * x);
        }
    }
}

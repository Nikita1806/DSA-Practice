package patternprinting;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int extra = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i + extra; k++) {
                System.out.print("* ");
            }
            extra++;
            System.out.println();
        }
    }
}

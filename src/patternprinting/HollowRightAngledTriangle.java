package patternprinting;
import java.util.Scanner;
public class HollowRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*METHOD 2:
        for (int row = 1; row <= n; row++) {
              if (row == 1 || row == 2 || row == n) {           // First two rows and last row are completely filled
                   for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");              // First star of the Row

                for (int col = 1; col <= row - 2; col++) {          // Hollow part
                    System.out.print("  ");
                }

                System.out.print("* ");              // Last  of the row
            }

            System.out.println();
        }
 */
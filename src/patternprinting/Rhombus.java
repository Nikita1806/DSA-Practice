package patternprinting;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int blank = n - i;      //you can also do blank = n - (i - 1) [if you do j < blank] to print one extra Blank space so that last row can have a space
            for (int j = 1; j <= blank; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* METHOD 2:
 for (int i = 1; i <= n; i++) {
 for (int j = 1; j <= 2 * n - 1; j++) {
    if (j <= n - i){
        System.out.print(" ");
    }else if(j <= (n - i) + n){
        System.out.print("* ");
        }
 }
        System.out.println();
}
 */
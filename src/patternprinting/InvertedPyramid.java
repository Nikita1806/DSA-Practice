package patternprinting;
import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int extra = n*2 - 1;
        for(int i = 1; i <= n; i++) {
           for(int j = 1; j <= i-1; j++){
               System.out.print("  ");
           }
           for(int k = 1; k<= extra; k++){
               System.out.print("* ");
           }
           extra = extra - 2;
            System.out.println();
        }
    }
}

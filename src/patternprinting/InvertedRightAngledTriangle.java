package patternprinting;
import java.util.Scanner;
public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
           char alpha = (char)65;
            for(int j = 1; j<= n-(i-1); j++){
                System.out.print(alpha+ " ");
                alpha++;
            }
            System.out.println();
        }
    }
}

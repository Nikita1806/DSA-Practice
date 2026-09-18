package BitManipulation;
import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter Value of B: ");
        int b = sc.nextInt();

        bitwiseAND(a,b);
    }

    public static void bitwiseAND(int a, int b){
        System.out.println(a & b);
    }
}

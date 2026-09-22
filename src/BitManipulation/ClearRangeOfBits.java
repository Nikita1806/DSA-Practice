package BitManipulation;
import java.util.Scanner;
public class ClearRangeOfBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit FROM you wanna CLEAR: ");
        int i = sc.nextInt();

        System.out.print("Enter the bit TILL you wanna CLEAR: ");
        int j = sc.nextInt();

        int result =  clearIthBitOfNum(num, i, j);
        System.out.println("After change: " + result);

    }

    public static int clearIthBitOfNum(int num, int i, int j) {
        int a = ~0 << j;
       // int b = (int)Math.pow(2, i-1) - 1;
        int b = (1 << (i-1)) - 1;
        int bitmask = a | b;

        return num & bitmask;
    }
}

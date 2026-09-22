package BitManipulation;
import java.util.Scanner;
public class ClearLastIBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit you wanna Update: ");
        int i = sc.nextInt();

        int result = clearLastIBitOfNum(num, i);
        System.out.println("After change: " + result);

    }

    public static int clearLastIBitOfNum(int num, int i) {
        int bitmask = ~0 << i;

        return num & bitmask;
    }
}

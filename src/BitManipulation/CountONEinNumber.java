package BitManipulation;
import java.util.Scanner;
public class CountONEinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
    }

    public static int countNoOfBitAsONE(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {                     //to check LSB
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}

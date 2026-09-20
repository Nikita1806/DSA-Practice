package BitManipulation;

import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit you wanna Set to 1: ");
        int i = sc.nextInt();

        int result = setIthBitOfNum(num, i);
        System.out.println("After change: " + result);


    }

    public static int setIthBitOfNum(int num, int i){
        int bitmask = 1<<i;

        return num | bitmask;
    }

}

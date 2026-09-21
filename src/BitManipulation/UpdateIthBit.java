package BitManipulation;
import java.util.Scanner;
public class UpdateIthBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit you wanna Update: ");
        int i = sc.nextInt();

        System.out.print("Enter number you want to change the bit into (0/1): ");
        int newBit = sc.nextInt();

       // int result = updateIthBitInNum(num, i, newBit);
        //System.out.println("After change: " + result);

        int result2 = updateIthBitInNum2(num, i, newBit);
        System.out.println("After change: " + result2);


    }

    //METHOD 1:
   /* public static int updateIthBitInNum (int num, int i, int newBit){

        if(newBit == 0){
            return ClearIthBit.clearIthBitOfNum(num,i);
        }else{
            return SetIthBit.setIthBitOfNum(num,i);
        }
    } */

    //METHOD 2:

    public static int updateIthBitInNum2(int num, int i, int newBit){
        int clearBit = ClearIthBit.clearIthBitOfNum(num, i);
        int bitMask = newBit<<i;
        return bitMask | clearBit;
    }
}

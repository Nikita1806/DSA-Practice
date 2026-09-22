package BitManipulation;
import java.util.Scanner;
public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        boolean result = powerOfTwoOrNot(num);
        if(result) {
            System.out.println("The Number is Power of 2. ");
        }else{
            System.out.println("The Number is NOT Power of 2. ");
        }


    }

    public static boolean powerOfTwoOrNot(int num){
        int bitMask = num & num-1;
        if(bitMask == 0){
            return true;
        }
        return false;
    }
}

package BitManipulation;
import java.util.Scanner;
public class GetIthBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit you wanna know: ");
        int i = sc.nextInt();

        boolean result = getIthBitOfNum(num, i);

        if(result){
            System.out.println("ith bit of given number is 0.");    //ith bit is 0
        }else{
            System.out.println("ith bit of given number is 1.");    //ith bit is 1
        }

    }

    public static boolean getIthBitOfNum(int num, int i){
        int bitmask = 1<<i;

        if((num & bitmask) == 0){
            return true;
        }

        return false;
    }
}

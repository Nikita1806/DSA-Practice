package BitManipulation;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        oddoreven(n);

    }

    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){                   //to check that LSB is One or Not.
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}

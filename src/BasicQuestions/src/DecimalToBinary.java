import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        int decNum = sc.nextInt();

        int pow = 0;
        int binNum = 0;

        while(decNum>0){
            int rem = decNum % 2; //as binary numbers have base 2
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum/2;
        }

        System.out.print("Binary Number: " + binNum);
    }
}

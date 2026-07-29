import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        int binNum = sc.nextInt();

        int decNum = 0;
        int pow = 0;

        while(binNum>0){
           int lastDigit = binNum % 10;  //as Decimal Numbers have base 10
           decNum = decNum + (lastDigit * (int)Math.pow(2,pow));   //as pow function takes variable in double and gives output in double
           pow++;
           binNum = binNum / 10;

        }

        System.out.print("Decimal Number: " + decNum);

    }
}

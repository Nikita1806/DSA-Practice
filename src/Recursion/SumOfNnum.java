package Recursion;
import java.util.Scanner;
public class SumOfNnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        long n = sc.nextInt();

        long result = sumOfNnumbers(n);
        System.out.println("Sum of " + n + " natural numbers: " + result);
    }

    public static long sumOfNnumbers(long n){
        if(n == 0){
            return 0;
        }

        return n + sumOfNnumbers(n-1);
    }
}

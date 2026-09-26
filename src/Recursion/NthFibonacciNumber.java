package Recursion;
import java.util.Scanner;
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int result = fibonacciNum(n);
        System.out.println(n + "th fibonacci number is " + result);

    }

    public static int fibonacciNum(int n) {
        if (n == 0) {                     //acc to Zero Indexing
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
    }
}

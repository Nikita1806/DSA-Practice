package Recursion;
import java.util.Scanner;
public class FastExponentiationByRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int b = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int n = sc.nextInt();

        int result = fastExpoByRecursion(b, n);
        System.out.println(b + " to the power of " + n + " is equal to " + result);

    }

    public static int fastExpoByRecursion(int b, int n){
        if(n == 1){                         //base case
            return b;
        }

        if(n%2 == 0){
            return fastExpoByRecursion(b,n/2)*fastExpoByRecursion(b,n/2);
        }else{
            return fastExpoByRecursion(b,n/2)*fastExpoByRecursion(b,n/2)*b;
        }
    }
}

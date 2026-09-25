package BitManipulation;
import java.util.Scanner;
public class FastExponentiation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int n = sc.nextInt();
        System.out.print("Enter Modulo: ");
        int m = sc.nextInt();

        long result = moduloFastExpo(a, n, m);
        System.out.print("Result: " + result);

    }

    public static long moduloFastExpo(long a, long n, long m){
        long ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = (ans * a)%m;
            }

            a = (a*a)%m;
        //    n = n/2;
            n = n>>1;
        }
        return ans;
    }

}

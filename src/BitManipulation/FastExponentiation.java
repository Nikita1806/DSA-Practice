package BitManipulation;
import java.util.Scanner;
public class FastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int n = sc.nextInt();

        int result = fastExpo(a,n);
        System.out.print("Result: " + result);

    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n&1) != 0){
                ans = ans*a;
            }

            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}

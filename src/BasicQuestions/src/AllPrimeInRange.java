import java.util.Scanner;
public class AllPrimeInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("All the Prime number till " + n + " : ");

        for (int k = 2; k <= n; k++) {
                boolean isPrime = isPrime(k);
                if (isPrime(k)) {
                    System.out.println(k);
                }
            }
        }

        public static boolean isPrime ( int n){
        if(n <= 1) {
            return false;
        }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

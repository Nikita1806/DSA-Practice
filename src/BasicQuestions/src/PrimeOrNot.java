import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if(n==1){
            System.out.print("1 is Neither Prime Nor Composite Number");
        }else if(n==2){
            System.out.print("2 is a Prime Number. ");
        }

        boolean isPrime = isPrime(n);
        if(isPrime) {
            System.out.println(n +" is a Prime Number.");
        }else{
            System.out.println(n +" is NOT a Prime Number.");
        }
    }

    public static boolean isPrime(int n){
             for(int i = 2; i<= Math.sqrt(n); i++){
                 if(n%i == 0) {
                     return false;
                 }
             }

        return true;
    }
}

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Number: ");
            int n = sc.nextInt();

            int factorialValue = factorial(n);
            System.out.println("Factorial of " + n + " : " + factorialValue);
        }

        public static int factorial(int num) {
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            return fact;
        }
    }


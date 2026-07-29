import java.util.Scanner;
public class BinomialCoefficient {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.print("Enter the value of r: ");
            int r = sc.nextInt();

            if (r > n) {
                System.out.println("Invalid Input! r cannot be greater than n.");
                return;
            }

            System.out.print("Binomial Coefficient: " + binomialCoefficient(n, r));
        }

        public static int binomialCoefficient(int n, int r) {
            int factN = Factorial.factorial(n);
            int factR = Factorial.factorial(r);

            int sub = (n - r);
            int factSUB = Factorial.factorial(sub);

            int binoCoef = factN / (factR * factSUB);
            return binoCoef;
        }
    }


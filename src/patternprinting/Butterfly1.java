package patternprinting;
import java.util.Scanner;
public class Butterfly1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){                          //upper part

            for(int j = 1; j<=i; j++){                        //printing first star
                System.out.print("* ");
            }

            for(int j = 1; j<= 2*(n-i); j++){                 //printing spaces
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++){                        //printing last star
                System.out.print("* ");
            }

                System.out.println();

        }

        for(int i = n-1; i>=1; i--){                          //lower part

            for(int j = 1; j<=i; j++){                        //printing first star
                System.out.print("* ");
            }

            for(int j = 1; j<= 2*(n-i); j++){                 //printing spaces
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++){                        //printing last star
                System.out.print("* ");
            }

            System.out.println();

        }


        }
}

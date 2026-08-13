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

            for(int j = 1; j<= n-(2*i); j++){                 //printing spaces
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++){                        //printing last star
                System.out.print("* ");
            }

                System.out.println();

        }

        for(int i = n; i>=1; i--){                          //lower part

            for(int j = 1; j<=i; j++){                        //printing first star
                System.out.print("* ");
            }

            for(int j = 1; j<= n-(2*i); j++){                 //printing spaces
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++){                        //printing last star
                System.out.println("* ");
            }

            System.out.println();

        }


        }
}

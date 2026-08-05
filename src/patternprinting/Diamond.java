package patternprinting;
import java.util.Scanner;
public class Diamond {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.print("Please Enter an Odd Number to print perfect Diamond Shape. ");
            } else {
                int blank = n / 2;
                int star = 1;

                int blank2 = 1;
                int star2 = n - 2;


                for (int i = 1; i <= (n + 1) / 2; i++) {              //Upper Half
                    for (int k = 1; k <= blank; k++) {
                        System.out.print("  ");
                    }
                    blank--;

                    for (int s = 1; s <= star; s++) {
                        System.out.print("* ");
                    }
                    star = star + 2;

                    System.out.println();
                }


                for (int j = 1; j <= (n - 1) / 2; j++) {          //Lower Half
                    for (int k = 1; k <= blank2; k++) {
                        System.out.print("  ");
                    }
                    blank2++;
                    for (int s = 1; s <= star2; s++) {
                        System.out.print("* ");
                    }
                    star2 = star2 - 2;

                    System.out.println();
                }
            }
        }
}


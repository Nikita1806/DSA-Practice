package patternprinting;
import java.util.Scanner;
public class HollowEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int row = 1;
        int col = n;
        int last = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if ((i == row && j == col) || (i == row && j == last) || (i == n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            row++;
            col--;
            last++;
            System.out.println();
        }
    }
}



/* METHOD 2:
 int blank = -1;

            for(int i = 1; i<=n; i++){
                if(i==n){
                    for(int j = 1; j<= n*2 -1; j++){
                        System.out.print("* ");
                    }
                }else{
                    for(int k = (n-i); k>0; k--){
                        System.out.print("  ");
                    }

                    System.out.print("* ");

                    for(int b = 1; b<=blank; b++){            //you can also do: for(int b = 1; b<=2*i - 3; b++){ TO PRINT BLANK SPACES  }
                        System.out.print("  ");
                    }
                    blank=blank+2;

                    if(i==1){                           //you can also just do: if(i!= 1){  System.out.print("*  ");}
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
 */
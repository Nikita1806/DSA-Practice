package patternprinting;
import java.util.Scanner;
public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

       int blank = n/2;
       int blank2 = -1;

       for(int i = 1; i<=n/2+1;i++){
           for(int j = 1; j<=blank; j++){
               System.out.print("  ");
           }
           blank--;

           System.out.print("* ");

           for(int k = 1; k<=blank2; k++){
               System.out.print("  ");
           }
           blank2 += 2;

           if(i!=1){
               System.out.print("* ");
           }

           System.out.println();
       }


        int blankDown= 1;
        int blankDown2 = n-4;

       for(int i = 1; i<=n/2; i++){
        for(int j = 1; j<= blankDown; j++){
            System.out.print("  ");
        }
        blankDown++;

        System.out.print("* ");

        for(int k = 1; k<=blankDown2; k++){
               System.out.print("  ");
           }
           blankDown2 -= 2;

           if(i!=n/2){
               System.out.print("* ");
           }

           System.out.println();
       }
    }
}

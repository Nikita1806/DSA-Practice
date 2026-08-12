package patternprinting;
import java.util.Scanner;
public class TriangleOfZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<(i+1); j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

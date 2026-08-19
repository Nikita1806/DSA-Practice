package array;
import java.util.Scanner;
public class TwoDArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Rows: ");
        int n = sc.nextInt();

        System.out.print("Enter the no. of Columns: ");
        int m = sc.nextInt();

        System.out.println("Enter the elements of the Array: ");
        int arr[][] = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

    }
}

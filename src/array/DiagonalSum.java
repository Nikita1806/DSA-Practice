package array;
import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size for Square matrix: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the Array: ");
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sumOfDiagonals(arr, n);

    }

    public static void sumOfDiagonals(int[][] arr, int n){

        int sum = 0;

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j == n - 1) || (i == j)) {
                    sum = sum + arr[i][j];
                }
            }
        }

        System.out.println("Sum of Diagonal Elements is " + sum);
    }
}

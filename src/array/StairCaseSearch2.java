package array;
import java.util.Scanner;
public class StairCaseSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows in Matrix: ");
        int n = sc.nextInt();

        System.out.print("Enter the no. of columns in Matrix: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the Element you want to search in Matrix: ");
        int key = sc.nextInt();

        stairCaseSearch(arr, key);

    }

    public static boolean stairCaseSearch(int[][] arr, int key){
        int row = arr.length-1, col = 0;
        while(row>=0 && col<arr[0].length){
            if(arr[row][col]== key){
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found! ");
        return false;
    }
}

package array;
import java.util.Scanner;
public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Rows: ");
        int n = sc.nextInt();

        System.out.print("Enter the no. of Columns: ");
        int m = sc.nextInt();

        System.out.println("Enter the elements of the Array: ");
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.print("Enter the element you want to Search: ");
        int key = sc.nextInt();

        searchingAnElement(arr,n,m,key);


    }

        public static boolean searchingAnElement(int[][] arr, int n, int m, int key){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == key) {
                        System.out.println("We Have Found Your Element at (" + i + "," + j + ")." );
                        return true;
                    }
                }
            }
            System.out.println("Element not Found in Array.");
            return false;
        }

}

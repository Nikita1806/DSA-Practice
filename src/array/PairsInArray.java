package array;
import java.util.Scanner;
public class PairsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pairingInArray(n, arr);
    }

        public static void pairingInArray(int n, int[] arr){
            for(int i = 0; i<n; i++){
                for(int k = 1; k<n-i; k++){
                    System.out.print("{" + arr[i] + "," + arr[i+k] + "} ");
                }
                System.out.println();
            }
        }
}

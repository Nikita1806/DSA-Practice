package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class InbuiltSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       //  Arrays.sort(arr);  -----> to sort the whole array

        Arrays.sort(arr, 0, 3);

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

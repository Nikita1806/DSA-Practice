package array;
import java.util.*;
public class Extra1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ") ;
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        countingSort(arr, n);

    }


        public static void countingSort(int arr[],int n) {
        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        for (int i = 0; i <= largest; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }                                         
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}

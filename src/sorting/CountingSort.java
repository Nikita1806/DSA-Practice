package sorting;
import java.util.Scanner;
public class CountingSort {
    public static void countingSorting(int arr[], int n){

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i = 0; i<n; i++){
            count[arr[i]]++;
        }

        int j = 0;    //to track original array (arr[])
        for(int i = 0; i< count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;      //to store the equal numbers and make the count[i] zero
            }
        }
    }

    public static void arrayPrinting(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countingSorting(arr, n);
        arrayPrinting(arr);
    }
}

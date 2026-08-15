package sorting;
import java.util.Scanner;
public class SelectionSort {
    public static void selectionSorting(int arr[], int n){
        for(int i = 0; i<n-1; i++){
            int minIndex = i;           //minIndex is Position of where Minimum Element is Present...initially we'll assume it at i
            for(int j = i+1; j<n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }

                //Swapping
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
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

        System.out.print("Enter the size of the Array: ") ;
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        selectionSorting(arr, n);
        arrayPrinting(arr);
    }
}

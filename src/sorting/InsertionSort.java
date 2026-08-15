package sorting;
import java.util.Scanner;
public class InsertionSort {
    public static void insertionSorting(int arr[], int n){
        for(int i = 1; i<n; i++){
            int curr = arr[i];     //this is the element to compare with sorted part
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
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

        insertionSorting(arr,n);
        arrayPrinting(arr);

    }


    public static void arrayPrinting(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}

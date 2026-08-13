package sorting;
import java.util.Scanner;
public class BubbleSort {
       public static void bubbleSorting(int arr[], int n){
           boolean swapping;
           for(int i = 0; i<n; i++){
               swapping = false;
               for(int j = 0; j<n-1-i; j++) {
                   if (arr[j] > arr[j + 1]) {
                       int temp = arr[j];
                       arr[j] = arr[j + 1];
                       arr[j + 1] = temp;

                       swapping = true;
                   }
               }

               if(swapping == false){
                   break;
               }
           }
       }


       public static void toPrintArray(int arr[], int n){
           for(int i = 0; i<n; i++){
               System.out.println(arr[i]);
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

           bubbleSorting(arr, n);
           toPrintArray(arr, n);
    }
}

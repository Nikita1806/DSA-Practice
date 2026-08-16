package sorting;
import java.util.Scanner;

public class CountingSortForNegative {
    public static void countingSortingForNegative(int arr[], int n){

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }

            if(arr[i]>max){
                max = arr[i];
            }
        }

        int[] count = new int[max - min + 1];

        for(int i = 0; i<n; i++){
            count[arr[i] - min]++;
        }

        int j = 0;

        for(int i = 0; i<count.length; i++){

            while(count[i]>0){

                arr[j] = i + min;

                j++;
                count[i]--;
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


        countingSortingForNegative(arr , n);
        arrayPrinting(arr);

    }
}

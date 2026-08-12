package array;
import java.util.*;
public class RepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

         boolean result =repeatedElement(arr,n);
        System.out.print(result);

    }

    public static boolean repeatedElement(int[] arr, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i]== arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

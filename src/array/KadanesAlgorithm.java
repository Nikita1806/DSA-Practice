package array;
import java.util.*;
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        kadaneAlgo(arr, n);

    }

    public static void kadaneAlgo(int[] arr, int n){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 1; i<n; i++){
            currSum += arr[i];

            maxSum = Math.max(currSum,maxSum);

            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("Our max subarray sum is " + maxSum);
    }
}

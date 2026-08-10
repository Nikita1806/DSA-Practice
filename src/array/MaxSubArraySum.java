package array;
import java.util.Scanner;
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }

        int largest = maximumSumOfSubArray(n, arr);
        System.out.println("Maximum sum among all the subarray's sum is " + largest);

    }


    public static int maximumSumOfSubArray(int n, int[] arr) {
        int biggest = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                int count = 1;
                     sum = arr[i];

                for (int k = 0; k < j; k++) {
                    sum = sum + arr[i + count];
                    count++;
                }
                if(sum>biggest){
                    biggest = sum;
                }
            }
        }
        return biggest;
    }
}


/*
public static int maximumSumOfSubArray(int n, int[] arr) {
      int biggest = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {          // starting index
           for (int j = i; j < n; j++) {      // ending index
            int sum = 0;
            for (int k = i; k <= j; k++) { // elements from i to j
                sum = sum + arr[k];
            }

            if (sum > biggest) {
                biggest = sum;
            }
        }
    }
    return biggest;
}
*/
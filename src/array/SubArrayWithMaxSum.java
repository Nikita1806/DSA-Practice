package array;
import java.util.Scanner;
public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maximumSubArray(arr);
    }
    public static void maximumSubArray(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            // Start a new subarray
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            // Update maximum
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);

        System.out.print("Maximum Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);

            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

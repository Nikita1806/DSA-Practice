package sorting;
import java.util.Scanner;
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();

        int index = targetIndex(arr, 0, n-1, target);
        System.out.print("The element you want to search is on Index " + index);
    }

    public static int targetIndex(int[] arr, int si, int ei, int target) {
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {                    //Target is in Line1
            if (arr[si] <= target && target <= arr[mid]) {              //Case A: Left Of Line1
                return targetIndex(arr, si, mid, target);
            } else {
                return targetIndex(arr, mid + 1, ei, target);         //Case B: Right Of Line1
            }
        } else {                                      //Target is in Line2
            if (arr[mid] <= target && target <= arr[ei]) {              //Case A: Right Of Line2
                return targetIndex(arr, mid + 1, ei, target);
            } else {
                return targetIndex(arr, si, mid, target);             //Case B: Left Of Line2
            }
        }
    }

}


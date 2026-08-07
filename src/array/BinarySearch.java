package array;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element at " + i + " : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the Element you want to search: ");
        int key = sc.nextInt();

        boolean found = binarySearching(n,arr, key);
        if(!found){
            System.out.println("The element you are searching is not present in given Array.");
        }
    }

    public static boolean binarySearching(int n, int[] arr, int key){
          int start = 0;
          int end = n-1;

          while(end>=start){
             int mid = (start+end)/2;;
              if(key==arr[mid]){
                  System.out.println("The element you are searching is at " + mid);
                  return true;
              }else if(key>arr[mid]){
                  start = mid + 1;
              }else{
                  end = mid - 1;
              }
          }
         return false;
    }
}

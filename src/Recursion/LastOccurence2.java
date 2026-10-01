package Recursion;
import java.util.Scanner;
public class LastOccurence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Element of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key from the array: ");
        int key = sc.nextInt();

        int i = n-1;                //for indexing
        int result = lastOccurence(arr, i, key);

        if(result == -1){
            System.out.println("The required key is not present in array.");
        }else {
            System.out.println("The required key last occurs at index " + result);
        }
    }

    public static int lastOccurence(int[] arr, int i, int key){
        if(i == -1){                 //   Base Condition
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return lastOccurence(arr, i-1, key);
    }
}

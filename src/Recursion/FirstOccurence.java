package Recursion;
import java.util.Scanner;
public class FirstOccurence {
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

        int i = 0;                //for indexing
        int result = firstOccurence(arr, i, key);

        if(result == -1){
            System.out.println("The required key is not present in array.");
        }else {
            System.out.println("The required key first occurs at index " + result);
        }
    }

    public static int firstOccurence(int[] arr, int i, int key){
        if (i == arr.length-1) {            //Base  Condition
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
}

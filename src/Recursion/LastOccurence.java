package Recursion;
import java.util.Scanner;
public class LastOccurence {
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
        int store = -1;              //to store the repeating value of Key
        int result = lastOccurence(arr, i, key, store);

        if(result == -1){
            System.out.println("The required key is not present in array.");
        }else {
            System.out.println("The required key last occurs at index " + result);
        }
    }

    public static int lastOccurence(int[] arr, int i, int key, int store){
        if(i == arr.length){                 //   Base Condition
            return store;
        }

        if(arr[i] == key){
            store = i;
        }

        return lastOccurence(arr, i+1, key, store);
    }
}

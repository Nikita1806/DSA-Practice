package Recursion;
import java.util.Scanner;
public class LastOccurence3{
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
        if (i == arr.length) {            //Base  Condition
            return -1;
        }

        int isFound = firstOccurence(arr, i+1, key);          //Traversing from Backward
        if(isFound == -1 && arr[i]==key){            //Testing for Slf too
            return i;
        }
        return isFound;
    }
}

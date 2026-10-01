package Recursion;
import java.util.Scanner;
public class ArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Element of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        boolean result = arraySortedOrNot(arr, i);
        if(result){
            System.out.println("Array is sorted. ");
        }else{
            System.out.println("Array is NOT sorted. ");
        }
    }

    public static boolean arraySortedOrNot(int[] arr, int i) {           //Using Recursion
        if (i == arr.length-1) {            //Base  Condition
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
            return arraySortedOrNot(arr, i + 1);
    }
}


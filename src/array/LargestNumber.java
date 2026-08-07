package array;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets find the largest Number: ");

        System.out.print("Enter the size of Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<size; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.print("Largest Element in the Array is " + largest);
    }
}

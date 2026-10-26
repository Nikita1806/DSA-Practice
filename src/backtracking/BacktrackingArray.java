package backtracking;
import java.util.Scanner;
public class BacktrackingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the number you want to start your array with: ");
        int num = sc.nextInt();

        int index = 0;

        backtrackAnArray(arr, num, index);

        System.out.println("Final Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void backtrackAnArray(int[] arr, int num, int index){
        if(index == arr.length){
            return;
        }

        arr[index] = num;

        backtrackAnArray(arr, num+1, index+1);         //Function call step

        arr[index] = arr[index] - 2;              //Backtracking step
    }
}

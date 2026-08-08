package array;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element at " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        System.out.println("Reversed Array: ");
        reverseArray(n, arr);
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }


    public static int[] reverseArray(int n, int[] arr){
        int first = 0;
        int last = n-1;
        int temp;
        while(first < last){
            temp= arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }
}

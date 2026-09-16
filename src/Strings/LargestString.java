package Strings;
import java.util.Scanner;
public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the String Array: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Strings in Array: ");
        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            arr[i]  = sc.nextLine();
        }

        String largestString = printLargestString(arr);
        System.out.print("Largest string among all is " + largestString);
    }

     // To compare words Lexicographically
    public static String printLargestString(String [] arr){
        String largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(largest.compareTo("arr[i]") < 0){
                largest = arr[i];
            }
        }
        return largest;
    }
}

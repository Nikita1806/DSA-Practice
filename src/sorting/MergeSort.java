package sorting;
import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;       //to find the mid Duh?
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si,mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;           // for temp array traverse

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){                       //for leftover elements of left sorted part
            temp[k++] = arr[i++];
        }

        while(j<=ei){                       //for leftover elements of right sorted part
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){            //copy temp array to original array
            arr[i] = temp[k];
        }
    }
}

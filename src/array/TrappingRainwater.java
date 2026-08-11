package array;
import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Total Numbers of Bars: ");
        int n = sc.nextInt();

        System.out.println("Enter the Heights of the bars: ");
        int heights[] = new int[n];
        for(int i = 0; i<n; i++){
            heights[i]= sc.nextInt();
        }

        int totalTrappedWater = trappedRainwaterCalculation(heights, n);
        System.out.print("Total Trapped RainWater Between These Bars is " + totalTrappedWater);

    }

    public static int trappedRainwaterCalculation(int[] arr, int n){

        int leftMax[] = new int[n];            //creating an array of left max boundary for each element
        leftMax[0] = arr[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];              //creating an array of right max boundary for each element
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>= 0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;            //will add trappedwater in this

        for(int i = 0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);     //waterlevel = minimum of leftMax Boundary and rightMax Boundary

            trappedWater = trappedWater + (waterlevel - arr[i]);    //trappedwater = waterLevel + height of that bar, and then will add all the trappedwater for each bar
        }

        return trappedWater;
    }
}

package array;
import java.util.Scanner;
public class BuyAndSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of days: ");
        int n = sc.nextInt();

        int prices[] = new int[n];
        System.out.println("Enter the prices of each day: ");
        for(int i = 0; i<n; i++){
            prices[i]= sc.nextInt();
        }

        calculatingBuyAndSellStocks(prices, n);

    }

    public static void calculatingBuyAndSellStocks(int arr[], int n){
        int buyingRate = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyDay = -1;
        int sellDay = -1;                               //No Valid day has been assigned yet so -1 in both


        for(int i = 0; i<n; i++){
            if(buyingRate < arr[i]){
                int profit = arr[i] - buyingRate;

                if(profit > maxProfit){
                    maxProfit = profit;
                    sellDay = i;
                }
            }else{
                buyingRate = arr[i];
                buyDay = i;
            }
        }

        System.out.println("Buy Stock on day " + (buyDay + 1));
        System.out.println("Sell Stock on day " + (sellDay + 1));
        System.out.println("Maximum Profit would be: " + maxProfit);
    }
}

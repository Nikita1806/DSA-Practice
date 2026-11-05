package backtracking;

public class GridWays{
    public static void main(String[] args) {

    }

    public static int gridways(int i, int j, int n, int m){
        //Base Case
        if(i == n-1 && j == m-1){
            return 1;
        }else if()
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1 + w2;
    }

}

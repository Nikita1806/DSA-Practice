package backtracking;
import java.util.Scanner;
public class NQueenNoOfWays {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Number: ");
            int n = sc.nextInt();

            char board[][] = new char[n][n];
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    board[i][j]= 'x';
                }
            }

            int totalNumOfWays = allPossiblePositionOnBoard(board, 0);

            System.out.print("Total number of ways to put " + n + " Queens on chess board: " + totalNumOfWays);



        }
        //All ways for putting N Queen safely
        public static boolean isSafeToPlaceHereQueen(char board[][], int row, int col){
            //Vertical up
            for(int i=row-1; i>=0; i--){
                if(board[i][col] == 'Q'){
                    return false;
                }
            }
            //Diagonally Left Up
            for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
            //Diagonally Right Up
            for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
            return true;
        }

        public static int allPossiblePositionOnBoard(char board[][], int row) {
            //Base Case
            if (row == board.length) {
                return 1;
            }

            int count = 0;
            //Column loop
            for (int j = 0; j < board.length; j++) {
                if (isSafeToPlaceHereQueen(board, row, j)) {
                    board[row][j] = 'Q';            //printing only one Q in each row
                    count += allPossiblePositionOnBoard(board, row + 1); //Function Call
                    board[row][j] = 'x';        //Backtracking step
                }
            }
            return count;
        }
}



package backtracking;
import java.util.Scanner;
public class BaseOfNQueen {
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
        allPossiblePositionOnBoard(board, 0);

    }
    //TO PRINT ALL POSSIBLE WAYS WHEN ONLY ONE QUEEN EXIST IN EACH ROW
    public static void allPossiblePositionOnBoard(char board[][], int row){
        //Base Case
        if(row == board.length){
            printingChessBoard(board);
            return;
        }

        //Column loop
        for(int j = 0; j<board.length; j++){
            board[row][j] = 'Q';            //printing only one Q in each row
            allPossiblePositionOnBoard(board, row+1); //Function Call
            board[row][j] = 'x';        //Backtracking step
        }
    }

    public static void printingChessBoard(char board[][]){
        System.out.println("--------------Chess Board--------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


}

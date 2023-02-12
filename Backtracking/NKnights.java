import java.util.*;
class NKnights{
    static int count = 0;
    static void nknights(char board[][], int row, int col, int knights){
        if(knights == 0){
            display(board);
            count++;
            System.out.println();
            return;
        }

        if(col == board[0].length){
            nknights(board, row+1, 0, knights);
            return;
        }

        if(row == board.length-1 && col == board[0].length){
            return;
        }
        if(row == board.length){
            return;
        }


        

        if(isTrue(board, row, col)){
            board[row][col] = 'K';
            nknights(board, row, col+1, knights-1);
            board[row][col] = '*';
        }
        nknights(board, row, col+1, knights);
    }

    static boolean isTrue(char board[][], int row, int col){

        
            if(isCheck(board, row-2, col+1) && board[row-2][col+1] != '*'){
                return false;
            }
            if(isCheck(board, row-2, col-1) && board[row-2][col-1] != '*'){
                return false;
            }
            if(isCheck(board, row-1, col-2) && board[row-1][col-2] != '*'){
                return false;
            }
            if(isCheck(board, row-1, col+2) && board[row-1][col+2] != '*'){
                return false;
            }
            
        return true;
    }
    static boolean isCheck(char board[][], int row, int col){
        if(row>=0 && col>=0 && row<board.length && col<board[0].length){
            return true;
        }
        return false;
    }

    static void display(char board[][]){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '*';
            }
        }
        nknights(board, 0, 0, n);
        System.out.println(count);
    }
}
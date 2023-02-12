public class Sudoku {
    static boolean isSafe(int board[][], int row, int col, int num){
        for(int i = 0; i<board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }
        for(int i = 0; i<board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        int rowStart = row - row%3;
        int colStart = col - col%3;
        for(int i = rowStart; i<rowStart+3; i++){
            for(int j = colStart; j<colStart+3; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean sudokuSolver(int board[][]){
        int row = -1, col = -1;
        boolean isFilled = true;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isFilled = false;
                    break;
                }
            }
        }
        if(isFilled){
            return true;
        }

        for(int i = 1; i<=9; i++){
           if(isSafe(board, row, col, i)){
            board[row][col] = i;
            if(sudokuSolver(board)){
                return true;
            } else{
                board[row][col] = 0;
            }
           }
                
        }
        return false;

    }
    static void display(int board[][]){
        for(int i = 0; i<board.length; i++){
            if(i == 0){
                System.out.println("  -----------------------------------");

            }
            for(int j = 0; j<board.length; j++){
                if(j == 0){
                    System.out.print(" | ");
                }
                System.out.print(" " +board[i][j] + " ");
                if((j+1)%3 == 0){

                    System.out.print(" | ");
                }
                
            }
            
            System.out.println();
            if((i+1)%3 == 0){

                System.out.println("  -----------------------------------");
            }
            
        }
    }
    public static void main(String args[]){
        
        int board[][] = {
                         {5, 3, 0, 0, 7, 0, 0, 0, 0},
                         {6, 0, 0, 1, 9, 5, 0, 0, 0},
                         {0, 9, 8, 0, 0, 0, 0, 6, 0},
                         {8, 0, 0, 0, 6, 0, 0, 0, 3},
                         {4, 0, 0, 8, 0, 3, 0, 0, 1},
                         {7, 0, 0, 0, 2, 0, 0, 0, 6},
                         {0, 6, 0, 0, 0, 0, 2, 8, 0},
                         {0, 0, 0, 4, 1, 9, 0, 0, 5},
                         {0, 0, 0, 0, 8, 0, 0, 7, 9}
                        };
        sudokuSolver(board);
        display(board);
    }
}

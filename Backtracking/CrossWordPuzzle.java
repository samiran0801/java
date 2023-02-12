public class CrossWordPuzzle {
    static void puzzleSolve(char board[][], String words[], int ind){
        if(ind == words.length){
            display(board);
            return;
        }
        String word = words[ind];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == '-' || board[i][j] == word.charAt(0)){

                    if(isPossibleVertically(board, word, i, j)){
                        boolean[] weSetVer = setVertically(board, word, i, j);
                        puzzleSolve(board, words, ind+1);
                        resetVertically(board, weSetVer, i, j);
                    }
                    if(isPossibleHorizontally(board, word, i, j)){
                        boolean[] weSetHor = setHorizontally(board, word, i, j);
                        puzzleSolve(board, words, ind+1);
                        resetHorizontally(board, weSetHor, i, j);
                    }
                }
            }
        }
    }
    static boolean isPossibleVertically(char board[][], String word, int row, int col){
        if(row-1>=0 && board[row-1][col] !='+'){
            return false;
        }
        if(row+word.length()<board.length && board[row+word.length()][col] !='+'){
            return false;
        }
        for(int i = 0; i<word.length(); i++){
            if(row+i>=board.length){
                return false;
            }
            if(board[row+i][col] == word.charAt(i) || board[row+i][col] == '-'){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
    static boolean[] setVertically(char board[][], String word, int row, int col){
        boolean [] weSet = new boolean[word.length()];
        for(int i = 0; i<word.length(); i++){
            if(board[row+i][col] == '-'){
                board[row+i][col] = word.charAt(i);
                weSet[i] = true;
            }
        }
        return weSet;
    }
    static void resetVertically(char board[][], boolean []weSet, int row, int col){
        for(int i = 0; i<weSet.length; i++){
            if(weSet[i] == true){
                board[row+i][col] = '-';
            }
        }
    }



    static boolean isPossibleHorizontally(char board[][], String word, int row, int col){
        if(col-1>=0 && board[row][col-1] !='+'){
            return false;
        }
        if(col+word.length()<board.length && board[row][col+word.length()] !='+'){
            return false;
        }
        for(int j = 0; j<word.length(); j++){
            if(col+j>=board[0].length){
                return false;
            }
            if(board[row][col+j] == word.charAt(j) || board[row][col+j] == '-'){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
    static boolean[] setHorizontally(char board[][], String word, int row, int col){
        boolean [] weSet = new boolean[word.length()];
        for(int j = 0; j<word.length(); j++){
            if(board[row][col+j] == '-'){
                board[row][col+j] = word.charAt(j);
                weSet[j] = true;
            }
        }
        return weSet;
    }
    static void resetHorizontally(char board[][], boolean []weSet, int row, int col){
        for(int j = 0; j<weSet.length; j++){
            if(weSet[j] == true){
                board[row][col+j] = '-';
            }
        }
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
        char board[][] = {{'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                          {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                          {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                          {'+', '-', '-', '-', '-', '-', '+', '+', '+', '+'},
                          {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'},
                          {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'},
                          {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
                          {'+', '+', '-', '-', '-', '-', '-', '-', '+', '+'},
                          {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
                          {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'}};
                
        String words[] = {"DELHI", "ICELAND", "ANKARA", "LONDON"};
        puzzleSolve(board, words, 0);
    }
    
}

import java.util.*;



public class NQueen {

    public static boolean isTrue(char [][] b, int row, int col){
        //check horizontal
        for(int i = 0; i<b.length; i++){
            if(b[row][i]=='Q'){
                return false;
            }
        }
        //check vertical
        for(int i = 0; i<b.length; i++){
            if(b[i][col]=='Q'){
                return false;
            }
        }

        //check upper left
        int r = row;
        for(int c = col; r>=0 && c>=0; r--, c--){
            if(b[r][c]=='Q'){
                return false;
            }
        }

        //check upper right
        r = row;
        for(int c = col; r>=0 && c<b.length; r--, c++){
            if(b[r][c]=='Q'){
                return false;
            }
        }


        //check lower left
        r = row;
        for(int c = col; r<b.length && c>=0; r++, c--){
            if(b[r][c]=='Q'){
                return false;
            }
        }

        //check lower right
        r = row;
        for(int c = col; r<b.length && c<b.length; r++, c++){
            if(b[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }



    public static void saveBoard(char[][] b, List<List<String>> allBoards){
        String row = "";
        List<String> newboard = new ArrayList<>();
        for(int i = 0; i<b.length; i++){
            row = "";
            for(int j = 0; j<b.length; j++){
                if(b[i][j] == 'Q'){ 
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newboard.add(row);
        }
        allBoards.add(newboard);
        // System.out.println(allBoards);
    }

    public static void helper(List<List<String>> allBoards, char[][] b, int col){
        if(col == b.length){
            saveBoard(b, allBoards);
            return;
        }

        for(int row = 0; row<b.length; row++){
            if(isTrue(b, row, col)){
                b[row][col] = 'Q';
                helper(allBoards, b, col+1);
                b[row][col] = '.';
                
            }
        }
    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char b[][] = new char[n][n];
        helper(allBoards, b, 0);
        return allBoards;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> allBoard = solveNQueens(n);
        System.out.println(allBoard);

    }
}

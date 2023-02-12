import java.util.*;
public class GoldMIne {
    static void getGold(int board[][], boolean visited[][], ArrayList<Integer> gold, int row, int col){
        if(row<0 || col<0 || row>=board.length || col>=board[0].length){
            return;
        }
        if(visited[row][col] == true || board[row][col] == 0){
            return;
        }
        visited[row][col] = true;
        gold.add(board[row][col]);
        getGold(board, visited, gold, row+1, col);
        getGold(board, visited, gold, row-1, col);
        getGold(board, visited, gold, row, col+1);
        getGold(board, visited, gold, row, col-1);


    }
    static void solveMine(int board[][], boolean visited[][]){
        int max =0, sum;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] !=0 && visited[i][j] == false){
                    ArrayList<Integer> goldBag = new ArrayList<Integer>();
                    getGold(board, visited, goldBag, i, j);
                    sum = 0;
                    for(int val : goldBag){
                        sum = sum+val;
                    }
                    if(sum>max){
                        max = sum;
                    }
                }

            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int board[][] = {{10, 15, 0, 100, 0, 0},
                         {13, 0, 0, 75, 0, 0},
                        {0, 0, 0, 23, 24, 26},
                        {0, 50, 55, 0, 0, 0},
                        {70, 0, 0, 16, 12, 11},
                        {90, 8, 17, 15, 17, 18}  };
        boolean visited[][]  = new boolean[board.length][board[0].length]  ;
        solveMine(board, visited);                 
    }
}

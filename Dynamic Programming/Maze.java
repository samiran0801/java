import java.util.*;
public class Maze {
    static Scanner sc = new Scanner(System.in);
    static void mazeRiver(int r, int c, String path, boolean[][] arr){
        
        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(path);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        
        if(r<arr.length-1){
            mazeRiver(r+1, c, path+'d', arr);
        }
        if(c<arr[0].length-1){
            mazeRiver(r, c+1, path+'r', arr);
        }
       
        
    }
    static void mazePath(int r, int c, String path){
        if(r == 0 && c == 0){
            System.out.println(path);
            return;
        }
        if(r>0){
            mazePath(r-1, c, path+'d');
        }
        if(c>0){
            mazePath(r, c-1, path+'r');
        }
       
        
    }
    static int maze(int r, int c, int dp[][]){
        if(r == 0 || c == 0){
            return 1;
        }
        else if(dp[r][c] != 0){
            return dp[r][c];
        }
        return maze(r-1, c, dp) + maze(r, c-1, dp);
    }
    public static void main(String args[]){
        // int row = sc.nextInt();
        // int column = sc.nextInt();
        boolean arr[][] = {{true, true, true}, 
                           {true, true, true}, 
                           {true, false, true}};
        
        //int dp[][] = new int[row][column];
        mazeRiver(0, 0, "", arr);
    }
}

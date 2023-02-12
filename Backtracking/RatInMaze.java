public class RatInMaze {
    static void solve(int[][] maze, int sol[][], int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            sol[row][col] = 1;
            display(sol);
            System.out.println();
            return;
        }
        if(row == maze.length || col == maze[0].length){
            return;
        }

        if(maze[row][col] == 0){
            return;
        }
        
        if(maze[row][col] == 1){
            sol[row][col] = 1;
            solve(maze, sol, row+1, col);
            solve(maze, sol, row, col+1);
            sol[row][col] = 0;
        }
        
        
    }
    static void display(int maze[][]){
        for(int i = 0; i<maze.length; i++){
            for(int j = 0; j<maze.length; j++){
                
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int maze[][] = {{1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1},
                        {0, 1, 0, 1, 0},
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 1, 1}};
        int sol[][] = new int[maze.length][maze[0].length];
        solve(maze, sol, 0, 0);
    }
}

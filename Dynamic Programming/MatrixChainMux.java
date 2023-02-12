import java.util.*;

public class MatrixChainMux {
    public static int mux(int A[], int m[][], int n[][], int i, int j){
        
        if(i==j){
            m[i][j] = 0;
            n[i][j] = 0;
            return 0;
        }
        if(m[i][j]!=-1){
            return m[i][j];
        }
        System.out.println("mux called for: i =  "+i+" j = "+j);
        for( int k = i; k<j; k++){
            if(m[i][j]==-1){

                
                m[i][j] = Math.max(m[i][j], mux(A, m, n, i, k) + mux(A, m, n, k+1, j) + (A[i]*A[k+1]*A[j+1]));
          
                
            }
            else{
                m[i][j] = Math.min(m[i][j], mux(A, m, n, i, k) + mux(A, m, n, k+1, j) + (A[i]*A[k+1]*A[j+1]));
              
            }
        }
       
        return m[i][j];
    }
    public static int runMux(int A[], int m[][], int n[][], int x){
        int i = 0, j = x-1;
        //System.out.println(j);
        return mux(A, m, n, i, j);
    }
    
    public static void main(String args[]){
        int A[] = {1, 2, 3, 4, 5};
        int x = A.length;
        //System.out.println(x);
        int[][] m = new int[x-1][x-1];
        int[][] n = new int[x-1][x-1];
        for(int i = 0; i<x-1; i++){
            for(int j = 0; j<x-1; j++){
                m[i][j] = -1;
            }
        }
        for(int i = 0; i<x-1; i++){
            for(int j = 0; j<x-1; j++){
                n[i][j] = -1;
            }
        }
        /*for(int i = 0; i<x-1; i++){
            for(int j = 0; j<x-1; j++){
                System.out.print(m[i][j] + " ");
                
            }
            System.out.println();
        }*/
        int result = runMux(A, m, n, x-1);
        System.out.println(result);
        for(int i = 0; i<x-1; i++){
            for(int j = 0; j<x-1; j++){
                System.out.print(m[i][j] + "\t");
                
            }
            System.out.println();
        }
        
        
       
        
    }
}

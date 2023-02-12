import java.util.*;
public class CheckSrted {
   
   
   
    public static void checkSorted(int A[], int n){
        if(n==A.length-1){
           System.out.println("sorted");
           return;
        }
        if(A[n]>=A[n+1]){

            System.out.println("not sorted");
            return;
            
        }
        
           checkSorted(A, n+1);
        
        }




        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] A=new int[n];
        for( int i = 0; i<n; i++){
            A[i]=sc.nextInt();

        }
        checkSorted(A, 0);
        
    }
}

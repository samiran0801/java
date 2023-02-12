import java.util.*;

public class RemoveDuplicate {
    public static int removeDup(int A[], int n){
        int index = 1;
        for(int i=0; i<n; i++){
           if(A[i]!=A[i+1]){
            A[index] = A[i+1];
            index++;
           }

        }
        return index-1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[100];
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            A[i]= sc.nextInt();
        }
        int n1 = removeDup(A, n);
        for(int i = 0; i<n1; i++){
            System.out.print(A[i] + " ");
        }
        
    }
}

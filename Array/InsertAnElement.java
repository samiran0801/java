import java.util.*;
public class InsertAnElement {
    public static void insertElement(int A[], int n, int key, int pos){
       
        for(int i = n-1; i>=pos-1; i--){
           A[i+1]=A[i];
           
           
        }
        A[pos-1]=key;
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] A=new int[100];
        int n = sc.nextInt();
        for(int i  = 0; i<n; i++){
            A[i]= sc.nextInt();
        }
        int key = sc.nextInt();
        int pos = sc.nextInt();
        insertElement(A, n, key, pos);
        for(int i  = 0; i<=n; i++){
            System.out.print(A[i]+" ");
        }
}
}

import java.util.*;
public class RemoveSpecificElement {
    public static int removeElement(int A[], int n, int key){
        int val = 0;
        for(int i = 0; i<n; i++){
            if(A[i]==key){
                for(int j = i; j<n; j++){
                    A[j]=A[j+1];
                }
                val++;
            }
            
        }
        return val;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] A=new int[100];
        int n = sc.nextInt();
        for(int i  = 0; i<n; i++){
            A[i]= sc.nextInt();
        }
        int key = sc.nextInt();
        int val = removeElement(A, n, key);
        for(int i  = 0; i<n-val; i++){
            System.out.print(A[i]+" ");
        }
}
}
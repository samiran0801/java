import java.util.*;
public class FindArrayInd {
    public static void findIndex(int A[], int n, int key){
        for(int i = 0; i<n; i++){
            if(A[i]==key){
                System.out.println("The "+key+" present in the "+i+"th index.");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] A=new int[100];
        int n = sc.nextInt();
        for(int i  = 0; i<n; i++){
            A[i]= sc.nextInt();
        }
        int key = sc.nextInt();
        findIndex(A, n, key);
       

    }
}

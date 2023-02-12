import java.util.*;

public class InsertionSort {
    public static void insertionSort(int A[], int n){
        for(int i = 0; i<n; i++){
            int current = A[i];
            int j = i-1;
            while(j>-1 && current < A[j]){
                A[j+1] = A[j];
                j--;
            }
            A[j+1]=current;

        }
    }

    public static void print(int[] A, int n){
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] A = new int[100];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of element: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        print(A, n);
        insertionSort(A, n);
        System.out.println();
        print(A, n);

    }
}

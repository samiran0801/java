
import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] A, int n){
        for(int i=0; i<n; i++){
            int smallest = i;
            for(int j=n-1; j>i; j--){
                if(A[smallest]>A[j]){
                    smallest = j;
                }
            }
            int temp = A[i];
            A[i]=A[smallest];
            A[smallest]=temp;
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
        selectionSort(A, n);
        print(A, n);

    }
}

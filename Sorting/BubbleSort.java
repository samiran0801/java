
import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] A, int n) {
        int temp;

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-i-1; j++) {
                if (A[j + 1] < A[j]) {
                    temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }

            }
        }
    }

    public static void print(int A[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];
        int n;
        System.out.println("Enter the no of element: ");
        n = sc.nextInt();
        System.out.println("Enter all elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        print(A, n);
        bubbleSort(A, n);
        System.out.println();
        print(A, n);
    }
}

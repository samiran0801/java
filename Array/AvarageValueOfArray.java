import java.util.*;
public class AvarageValueOfArray {
    public static int averageValue(int A[], int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum=sum+A[i];
        }
        int avg = sum/n;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] A=new int[100];
        int n = sc.nextInt();
        for(int i  = 0; i<n; i++){
            A[i]= sc.nextInt();
        }
        int result = averageValue(A, n);
        System.out.println(result);

    }
}

import java.util.*;
public class ClimbStairs {
    static int climbstairs(int n, int arr[]){
        if(n == 0 || n == 1){
            arr[n] = 1;
            return 1;
        }
        if(n<0){
            return 0;
        }
        int result = climbstairs(n-1, arr)+climbstairs(n-2, arr)+climbstairs(n-3, arr);
        arr[n] = result;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println(climbstairs(n, arr));
    }
}

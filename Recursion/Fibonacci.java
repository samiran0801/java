import java.util.*;

public class Fibonacci {
    public static void fibonacci(int a, int b, int n){
       if(n==0){
        return;
       }
       int c = a+b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int n = sc.nextInt();
        System.out.print(a + " " + b+ " ");
        fibonacci(a, b, n-2);
    }
}

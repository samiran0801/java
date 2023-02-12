import java.util.*;

public class Factorial {
    public static int factorial(int n){
        int fac;
        if(n==1){
            return 1;
        }
        else{
            fac = n*factorial(n-1);
            return fac;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}

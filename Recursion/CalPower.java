import java.util.*;
public class CalPower {
    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
         if(n==1){
             return x;
         }

        if(n%2==0){
            return calPower(x, n/2) * calPower(x, n/2);
        }

        else{
            return calPower(x, n/2) * calPower(x, n/2) * x;

        }
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int val = calPower(x, n);
        System.out.println(val);
    }
}

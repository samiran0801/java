import java.util.*;

public class PrintSum {
    public static int printNaturalNum(int n){
        if(n==1){
            return 1;
        }
        else{
            int sum = n+printNaturalNum(n-1 );
            return sum;
        }
    }
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        sum = printNaturalNum(n);
        System.out.println(sum);

   } 
}

import java.util.*;
public class ButterflyPattern {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n, i, j;
    n = sc.nextInt();
    for(i=1; i<=n; i++){
        for(j=1; j<=i; j++){
            System.out.print(" * ");
        }
        int sp = 2*(n-i);
        for(j=1; j<=sp; j++){
            System.out.print("   ");
        }
        for(j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

    for(i=n; i>=1; i--){
        for(j=1; j<=i; j++){
            System.out.print(" * ");
        }
        int sp = 2*(n-i);
        for(j=1; j<=sp; j++){
            System.out.print("   ");
        }
        for(j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
   } 
}

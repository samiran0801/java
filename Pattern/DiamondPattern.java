import java.util.*;
public class DiamondPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();
        for(i = 1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(j=2; j<=i; j++){
                System.out.print(" * ");
            }
           
           

            System.out.println();
        }

        for(i = 1; i<=n; i++){
            for(j=n; j>=n-i+1; j--){
                System.out.print("   ");
            }
            for(j=i; j<=n-1; j++){
                System.out.print(" * ");
            }
           
            for(j=i; j<=n-2; j++){
                System.out.print(" * ");
            }
           

            System.out.println();
        }
    }
}

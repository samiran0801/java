import java.util.*;
public class FloydTriangle {
    public static void main(String args[]){

        int n, i, j, num=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

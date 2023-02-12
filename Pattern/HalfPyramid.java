import java.util.*;
public class HalfPyramid {
    public static void main(String args[]){
        int r , c, i, j;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        r = c;
        for(i=1; i<=r; i++){
            System.out.println();
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
        }
    }
}

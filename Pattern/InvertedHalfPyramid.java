import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String args[]){
        int n, i, j;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i = n; i>0; i--){
            System.out.println();
            for(j = 0; j<i; j++){
                System.out.print("*");
            }
        }

    }
}

import java.util.*;
public class PlaceTiles {
    public static int placeTiles(int m, int n){
        if(m==n){
            return 2;
        }
        if(m<n){
            return 1;
        }


        int vertical = placeTiles(m-n, n);
        int horizontal = placeTiles(m-1, n);
        return vertical+horizontal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int value = placeTiles(m, n);
        System.out.println(value);
        
    }
}

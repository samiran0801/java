
import java.util.Scanner;
public class PowerOf {
    
    public static int fun(int x, int n) {
        int num;
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        num = x * fun(x, n - 1);
        return num;
    
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fun(x, n));
    
    }
}





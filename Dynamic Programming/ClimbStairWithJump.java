import java.util.*;
public class ClimbStairWithJump {
    static Scanner sc = new Scanner(System.in);
    static int countClimb(int n, int tab[], int climb[]){
        tab[n] = 1;
        for(int i = n-1; i>=0; i--){
            for(int j = 1; j<=climb[i]; j++){
                if(n>=i+j){
                tab[i] = tab[i] + tab[i+j];
                }
            }
        }
        return tab[0];
    }
    static void init(int climb[], int n){
        for(int i = 0; i<n; i++){
            climb[i] = sc.nextInt();
        }
    }
    static void printarr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tab[] = new int[n+1];
        int climb[] = new int[n];
        init(climb, n);
        
        System.out.println(countClimb(n, tab, climb));
        System.out.println();
        printarr(tab, n+1);
    }
}

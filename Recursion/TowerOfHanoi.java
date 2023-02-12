import java.util.*;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String help, String des){
        if(n==1){
            System.out.println("Transfer disk "+ n +" from "+src+" to "+ des);
            return;
        }

        towerOfHanoi(n-1, src, des, help);
            System.out.println("Transfer disk "+ n +" from "+src+" to "+ des);
        towerOfHanoi(n-1, help, src, des);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");
    }
}

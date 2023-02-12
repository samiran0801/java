import java.util.*;
public class Knapsack {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int item = sc.nextInt();

        int weight[] = new int[item];
        int value[] = new int[item];
        for(int i = 0; i<item; i++){
            weight[i] = sc.nextInt();
        }
        for(int i = 0; i<item; i++){
            value[i] = sc.nextInt();
        }
        int bag = sc.nextInt();
        int dp[][] = new int[item + 1][bag + 1];
        for(int i = 1; i<dp.length; i++){
            int w = weight[i-1];
            int v = value[i-1];
            for(int j = 1; j<dp[0].length; j++){
                if(j>=w){
                    if(dp[i-1][j-w]+v > dp[i-1][j]){
                        dp[i][j] = dp[i-1][j - w]+v;
                    } else{
                        dp[i][j] = dp[i-1][j];
                    }
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[item][bag]);

    }
}

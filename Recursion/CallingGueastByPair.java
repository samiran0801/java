import java.util.Scanner;

import java.util.*;
public class CallingGueastByPair {
    public static int callingGuestByPair(int n){
        if(n<=1){
            return 1;
        }
        int single = callingGuestByPair(n-1);
        int pair = (n-1) * callingGuestByPair(n-2);
        return single+pair;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = callingGuestByPair(n);
        System.out.println(value);

    }
}

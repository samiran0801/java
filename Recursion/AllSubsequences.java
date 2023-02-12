import java.util.*;
public class AllSubsequences {
    public static void allSub(String str, String str2, int ind){
        if(ind == str.length()){
            System.out.println(str2);
            return;
        }
        char c = str.charAt(ind);
        allSub(str, str2+c, ind+1);
        allSub(str, str2, ind+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println();
        allSub(str, "", 0);


    }
}

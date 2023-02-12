import java.util.*;

public class AllUniSub {
    public static void allUniSub(String str, String str2, int ind, HashSet<String> set){
        if(ind == str.length()){
            if(set.contains(str2)){
                return;
            }
            else{

                System.out.println(str2);
                set.add(str2);
                return;
            }
        }
        char c = str.charAt(ind);
        allUniSub(str, str2+c, ind+1, set);
        allUniSub(str, str2, ind+1, set);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        System.out.println();
        allUniSub(str, "", 0, set);


    }
}

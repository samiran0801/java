import java.util.*;
public class KeyPad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
    public static void keyPadCom(String str, int ind, String str2){
        if(ind==str.length()){
            System.out.print(str2+" ");
            return;
        }
        char curChar = str.charAt(ind);
        String map = keypad[curChar-'0'];
        for(int i = 0; i<map.length(); i++){
            keyPadCom(str, ind+1, str2+map.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        keyPadCom(str, 0, "");

    }
}

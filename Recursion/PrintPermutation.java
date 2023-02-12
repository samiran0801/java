import java.util.*;
public class PrintPermutation {
    public static void printPermutation(String str, String per){
        if(str.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char cChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, per+cChar);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutation(str, "");

    }   
}

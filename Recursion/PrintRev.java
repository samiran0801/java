import java.util.*;
public class PrintRev {
    public static void printRev(String str, int len){
        if(len == 0){
            System.out.print(str.charAt(len));
            return;
        }
        System.out.print(str.charAt(len));
        printRev(str, len-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printRev(str, str.length()-1);


    }
}

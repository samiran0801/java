import java.util.*;
public class PutInLast {
    public static int count = 0;
    public static int count1 = 0;

    public static String str2 = "";
    public static void putLast(String str, char x, int ind){
        char curChar = str.charAt(ind);
        if(ind == str.length()-1){
            str2 = str2 + curChar; 
            for(int i=0; i<count; i++){
                str2+=x;
            }
            return;
        }
        if(str.charAt(ind)==x){
            count++;
            putLast(str, x, ind+1);
        }
        else{
            str2 = str2 + curChar; 
            putLast(str, x, ind+1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char x=sc.next().charAt(0);
        putLast(str , x, 0);
        System.out.println(str2);


    }
}

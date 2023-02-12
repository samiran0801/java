import java.util.*;
public class Findoccurence {
    public static int first = -1;
    public static int last = -1;
    public static void findOcc(String str, int len, char ele){
        if(str.length()==len){
            System.out.println(first +" "+ last);
            return;
        }
        if(ele == str.charAt(len)){
            if(first==-1){
                first = len;
            }
            else
                last = len;
        }

        findOcc(str, len+1, ele);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char key = sc.next().charAt(0);
        findOcc(str, 0, key);
}
}
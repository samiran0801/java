import java.util.*;
public class RemoveDuplicateChar {
    
    
    public static void removeDup(String str, String str2, Boolean A[], int n){
        if(n==str.length()){
            System.out.println(str2);
            return;
        }
        char c = str.charAt(n);
        if(A[c-'a']){
            removeDup(str, str2, A, n+1);
            
            
        }
        
        else{
            str2=str2+c;
            A[c-'a']=true;
            removeDup(str, str2, A, n+1);

        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean[] A = new Boolean[26];
        Arrays.fill(A, Boolean.FALSE);
        String str2 = "";
        
        

       
        removeDup(str, str2, A, 0);
        for(int i = 0; i<A.length; i++){
            
            System.out.print(A[i]+" ");
        }

    }
}

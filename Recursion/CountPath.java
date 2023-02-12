public class CountPath {
    public static int countPath(int m, int n, int i, int j){
        System.out.println("calling function for i = "+i+", j = "+j);
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        // System.out.println("calling downmove for i = "+i+", j = "+j);
        int downMove = countPath(m, n, i+1, j);

        // System.out.println("calling rightmove for i = "+i+", j = "+j);
        int rightMove = countPath(m, n, i, j+1);

        return downMove+rightMove;
    }
    public static void main(String args[]){
        int m=3, n=3;
        int count = countPath(m, n, 0, 0);
        System.out.println(count);

    }
}

class FirstDp {
    public static int recursion(int n) {
        System.out.println("recursion called for - "+n);
        if (n == 1 || n == 0) {

            return 1;
        }

        return recursion(n-1)+recursion(n-2);

    }

    public static int memo(int n, int A[]) {
        System.out.println("memo called for - " + n);
        if (n == 0 || n == 1) {
            if (n == 0) {
                A[n] = 1;
            } else {
                A[n] = 1;
            }
            return 1;
        }
        if (A[n] != 0) {
            return A[n];
        } else {
            A[n] = memo(n - 1, A) + memo(n - 2, A);
            return A[n];
        }
    }
    public static int tabu(int n, int A[]){
        A[0] = 1;
        A[1] = 1;
        for(int i = 2; i<=n; i++){
            A[i] = A[i-1]+A[i-2];
        }
        return A[n];
    }

    public static int other(int n){
        int a = 1, b = 1, c = 0;
        for( int i = 2; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c; 
    }

    public static void main(String args[]) {
        int n = 5;
        int A[] = new int[n + 1];
        System.out.println(other(n));
        for (int i = 0; i <= n; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
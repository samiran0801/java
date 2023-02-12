import java.util.*;
public class ArrayOperation {
    public static int MAX = 100;

    public static void insertElement(int A[], int n, int key, int pos){
        for(int i = n-1; i>=pos-1; i--){
           A[i+1]=A[i];
        }
        A[pos-1]=key;
       
    }

    public static int removeElement(int A[], int n, int key){
        int val = 0;
        for(int i = 0; i<n; i++){
            if(A[i]==key){
                for(int j = i; j<n; j++){
                    A[j]=A[j+1];
                }
                val++;
            }
            
        }
        return val;
    }

    public static void bubbleSort(int[] A, int n) {
        int temp;

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-i-1; j++) {
                if (A[j + 1] < A[j]) {
                    temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }

            }
        }
    }

    public static void searchElement(int A[], int n, int key){
        for(int i=0; i<n; i++){
            if(A[i]==key){
                System.out.println("Element found in index no: "+i);
            }
        }
    }

    public static int getAvg(int A[], int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum=sum+A[i];
        }
        return sum/n;
    }

    public static void getMaxMin(int A[], int n){
        int max = A[0];
        int min = A[0];
        for(int i = 1; i<n; i++){
            if(max<A[i]){
                max = A[i];
            }

            if(min>A[i]){
                min = A[i];
            }
        }
        System.out.println("Max value in this array is: "+max);
        System.out.println("Min value in this array is: "+min);
    }

    public static void occurenceNum(int A[], int n, int key){
        int a=0;
        for(int i = 0; i<n; i++){
            if(A[i]==key){
                a++;
            }
        }
        if(a==0){
            System.out.println(key+" value is not exist in this array");
        }
        else
            System.out.println(key + " found "+a+" times in this array");
    }


    public static int removeDup(int A[], int n){
        int index = 1;
        for(int i=0; i<n; i++){
           if(A[i]!=A[i+1]){
            A[index] = A[i+1];
            index++;
           }

        }
        return index-1;
    }

    public static void print(int A[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[MAX];
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println("Input the array element: ");
        for(int i = 0; i<n; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("\n 1. Insert an element  2. Delete an element  3. Search for an element ");
        System.out.println("4. Getting average  5. Getting max min  6. Occurence of any number ");
        System.out.println("7. Delete repeat number  8. Print array  9. Exit \n");
       
        System.out.print("Input your choice: ");
        int choice = sc.nextInt();
        while(choice<9){ 
            switch(choice){
                case 1: 
                    System.out.print("Element to be inserted: ");
                    int el = sc.nextInt();
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    insertElement(A, n, el, pos);
                    n++;
                    break;
                case 2:
                    System.out.print("Element to be deleted: ");
                    int key = sc.nextInt();
                    n = n - removeElement(A, n, key);
                    break;

                case 3:
                    System.out.print("Element to be search: ");
                    int key1 = sc.nextInt();
                    searchElement(A, n, key1);
                    break;

                case 4:
                    System.out.println(getAvg(A, n));
                    break;

                case 5:
                    getMaxMin(A, n);
                    break;
                case 6:
                    System.out.print("Enter the key: ");
                    key = sc.nextInt();
                    occurenceNum(A, n, key);
                    break;

                case 7:
                    n = removeDup(A, n);
                    System.out.println("Removed all duplicate");
                    break;

                case 8:
                    print(A, n);
                default:
            }
            System.out.println("\n 1. Insert an element  2. Delete an element  3. Search for an element ");
            System.out.println("4. Getting average  5. Getting max min  6. Occurence of any number ");
            System.out.println("7. Delete repeat number  8. Print array  9. Exit \n");
           
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
        }

    }
}

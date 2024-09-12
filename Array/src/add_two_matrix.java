import java.util.Scanner;

public class add_two_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What will be the size  of row");
        int m1 = sc.nextInt();
        System.out.println("What will be the size of column");
        int n1 = sc.nextInt();
        int arr1[][] = new int[m1][n1];
        int arr2[][] = new int[m1][n1];
        int sum_arr[][] = new int[m1][n1];

        for (int i=0; i <m1; i++){
            for (int j=0; j<n1; j++){
                System.out.println("Write the array1");
                arr1[i][j] = sc.nextInt();
                System.out.println("Write the array2");
                arr2[i][j] = sc.nextInt();
            }
        }

       for (int i=0; i<m1; i++){
           for (int j=0; j<n1; j++){
               sum_arr[i][j] = arr1[i][j] + arr2[i][j];
               System.out.print(sum_arr[i][j] + " ");
           }
           System.out.println();
       }




    }
}

package Searching;

public class Missing_array {
    static int  missingNumber(int n, int arr[]) {
        int sum =0;
        for(int i=0; i<n-1; i++){
            sum += arr[i];
        }
        int total_sum = n * (n+1)/2;
        return total_sum- sum;


    }

    public static void main(String[] args) {
        int arr[] ={4,3,1,5};
        int n = 5;
       int result= missingNumber(n, arr);
        System.out.println(result);
    }
}

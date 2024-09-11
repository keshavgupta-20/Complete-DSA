package Searching;

public class Recur_using_binary {
    public static int Recursbinary(int arr[], int target, int start, int end){
        if (start>end){
            return 0;
        }
        int mid = start + (end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            return Recursbinary(arr, target, start, mid-1);
        }
        else{
            return Recursbinary(arr, target, mid+1, end);
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,4,6,7,9};
        int target = 6;
        int result = Recursbinary(arr, target, 0, arr.length-1);
        System.out.println(result);

    }
}

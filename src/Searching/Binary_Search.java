
package Searching;

public class Binary_Search {
    public static  int binarySearch(int arr[], int target){
        int low =0; int high = arr.length-1 ;
        while(low<=high){
            int mid = low +(high-low)/2;
            if (arr[mid]== target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,6,7,9};
        int target = 6;
        int result = binarySearch(arr, target);
        System.out.println(result);

    }

}

package Searching;

public class Floor_in_a_sorted_array {
    static int findFloor(long arr[], int n, long x) {
        int low = 0, high = n - 1;
        int temp = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= x) {
                temp = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        long arr[] = {1,4,5,6,8,9};
        int result = findFloor(arr, 6, 7);
    }
}

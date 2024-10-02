public class arrange_0_1 {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static  void sortzeroes(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            if (arr[left] ==1 && arr[right] ==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] ==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,0,1};
           sortzeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

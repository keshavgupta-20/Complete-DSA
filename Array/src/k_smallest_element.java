public class k_smallest_element {
    public static int kthSmallest(int[] arr, int k) {
        int j=1;
        int temp = arr[0];
        while(k<=j){
            for(int i=0; i<arr.length; i++){
                if(temp<arr[i]){
                    temp = arr[i];
                }
            }
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] =  {3,7,4,9, 11,23};
        int result = kthSmallest(arr, 3);
        System.out.println(result);

    }
}

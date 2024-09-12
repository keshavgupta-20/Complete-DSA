public class array_is_sorted {
    public static void main(String[] args) {
        int arr[] = {2,52,6,7,8};
        boolean flag = true;
        for (int i=0; i< arr.length-1; i++){
            if (arr[i+1]<arr[i]){
                flag = false;
                break;
            }
        }
        if (!flag){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("array is sorted");
        }
    }
}

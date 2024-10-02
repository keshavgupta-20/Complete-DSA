import java.util.ArrayList;
import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1,2,-1, -4};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == 0){
                ArrayList<Integer> r2 = new ArrayList<>();
                r2.add(arr[left]);
                r2.add(arr[right]);
                result.add(r2);

                while(left<right && arr[left]==arr[left+1]){
                    left++;
                }
                while(left<right && arr[right]==arr[right-1]){
                    right--;
                }
                left++;
                right--;
            }
            else if (sum <0) {
                left++;
            }
            else{
                right--;
            }


        }
    }
}

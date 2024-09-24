import java.util.ArrayList;
import java.util.HashSet;

public class Minimum_jumps {
    public static void main(String[] args) {
        int nums[] = {2,3,4,5,2};
        int temp =0;
        HashSet<Integer> h1 = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            
            if(h1.contains(nums[i])){
                temp = nums[i];
            }
            else{
                h1.add(nums[i]);
            }
        }
        System.out.println(temp);
    }
}

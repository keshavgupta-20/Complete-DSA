import java.util.ArrayList;

public class alternqate {
    public static void main(String[] args) {
        int arr[] = { 3,5,1,-2,5,-3,-7};
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                arr1.add(i);
            }
            else{
                arr2.add(i);
            }
        }
        for (int i = 0; i < arr.length; i++) {

        }
    }
}

import java.util.ArrayList;

    public class max_value {
        public static void printsequence(int[] arr, int index, ArrayList<Integer> tempArr){
            if (index == arr.length){
                if (tempArr.size()>0){
                    System.out.println(tempArr);
                 }
                return;
            }
            printsequence(arr, index+1, tempArr);
            tempArr.add(arr[index]);
            printsequence(arr, index+1, tempArr);
            tempArr.remove(tempArr.size()-1);
        }
    }

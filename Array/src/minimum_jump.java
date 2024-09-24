public class minimum_jump {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,3,2};
        int k =0;
        int count =0;
        for (int i =0; i<arr.length-1; i++){
            k = arr[i];
            i =k;
            count++;
        }
        System.out.println(count);
    }
}

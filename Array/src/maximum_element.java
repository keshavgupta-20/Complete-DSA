public class maximum_element {
    public static void main(String[] args) {
        int arr[] = {3,4,11,7,8, -1, 9999};
        int temp =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>temp){
                temp = arr[i];
            }

        }
        System.out.println(temp);

    }
}

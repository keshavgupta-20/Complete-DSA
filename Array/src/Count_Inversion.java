public class Count_Inversion {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        int count =0;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

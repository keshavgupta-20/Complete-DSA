package Searching;

public class reverse {
    public static void main(String[] args) {
        int arr1[] ={4,6,7,9};
        int arr2[]= {1,4,7,8};
        int len = arr1.length + arr2.length;
        int arr3 = new int[len];

        int low = 0;
        int high = arr.length;


        if (arr.length%2 ==0){
            int mid = low +(high-low)/2;
            System.out.println(arr[mid] +" "+ arr[mid-1]);
        }
        else{
            int mid = low +(high-low)/2;
            System.out.println(arr[mid] );
        }

    }

}

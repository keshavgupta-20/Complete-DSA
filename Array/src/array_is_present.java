import java.util.Scanner;

public class array_is_present {
    public static void main(String[] args) {
        int arr[] = {3,5,7,1,8};
        System.out.println("Search an integer");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean  flag = false;
        for (int c1: arr) {
            if (c1 == target){
                flag = true;
                break;
            }

        }
        if (!flag){
            System.out.println("No is not present in an array");
        }
        else{
            System.out.println("Integer is found in an array");
        }

    }
}

import java.util.Scanner;

public class odd_number {
    public static void main(String[] args) {
        System.out.println("How many number you want to print");
        int odd_no = 1;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while(cnt != 0){
            System.out.println(odd_no);
            odd_no = odd_no +2;
            cnt--;
        }
    }
}

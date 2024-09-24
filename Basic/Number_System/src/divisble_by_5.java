import java.util.*;
public class divisble_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number you want to check the divisbilty of 5");
        int n = sc.nextInt();
        if (n%5==0){
            System.out.println("It is divisble by 5");
        }
        else{
            System.out.println("It is not divisble");
        }
    }
}

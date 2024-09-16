import java.util.*;
public class nTh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the no");
        int  n = sc.nextInt();
        int z = factorial(n);
        System.out.println(z);
    }
    public static int factorial(int n){
        return  n*(n+1)/2;
    }
}

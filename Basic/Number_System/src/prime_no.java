import java.util.*;
public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many prime number do you want");
        int n = sc.nextInt();
        prime_no(n);
    }
    public static void prime_no(int n){
        int cnt= 0;
        int num =2;
        while(cnt<n){
            if(isPrime(num)){
                System.out.println(num);
                cnt++;
            }
        num++;
        }

    }
    public static boolean isPrime(int N){

        for (int i =2; i<N; i++){
            if (N%i==0){
                return false;
            }
        }
        return true;
    }
}

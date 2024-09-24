public class sum_of_digit {
    public static void main(String[] args) {

        int total_sum = sum(22);
        System.out.println(total_sum);
    }
    public static int sum(int n){
        if(n==0){
            return n;
        }
        else{
            return (n%10 + sum(n/10));
        }
    }
}

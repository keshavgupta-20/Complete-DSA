public class sum_of_digit {
    public static void main(String[] args) {
        int num = 234;
        int result = sum_ofdigit(num);
        System.out.println(result);
    }
    public static int sum_ofdigit(int n){

        if(n<10){
            return n;
        }
        else{
            int result = n%10;
            result = sum_ofdigit(n/10) +result;
            return result;
        }

    }
}

public class Factorial {
    public static void main(String[] args) {
        int a =2;
        int b =4;
        int result = Fiboncci(a,b);
        System.out.println(result);

    }
    public static int Fiboncci(int a, int b){
        int result =1;
        if(b==1) {
            return a;
        }
        else{
            result = a* Fiboncci(a, b-1);
        }
        return result;
    }
}

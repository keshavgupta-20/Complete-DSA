public class fiboncii_series {
    public static void main(String[] args) {
        int n =10;
        for (int i=0; i<n; i++){
            System.out.println(fibonnci(i));
        }
    }
    public static int fibonnci(int n){
        if(n<=1){
            return  n;
        }
        else{
            return fibonnci(n-1)+ fibonnci(n-2);
        }
    }
}

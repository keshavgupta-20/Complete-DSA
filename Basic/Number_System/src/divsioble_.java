public class divsioble_ {
    public static void main(String[] args) {

        int no = 1;
        while(no<1000){
            int r = no%11;
            if (r==3){
                System.out.println(no);
            }

            no++;
        }
    }
}

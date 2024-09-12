import java.util.Scanner;

public class sum_of_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] f1 = new float[5];
        float sum = 0f;
        for (int i=0; i<f1.length; i++){
            f1[i] = sc.nextFloat();
            sum += f1[i];
        }
        System.out.println(sum);

    }
}

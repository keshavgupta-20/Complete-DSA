import java.util.Scanner;

public class F_to_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the temperature in f");
        int F = sc.nextInt();
        double c = (F-32)*5/9;
        System.out.println(c);
    }
}

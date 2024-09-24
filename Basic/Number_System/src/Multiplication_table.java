import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the table of");
        int n = sc.nextInt();
        System.out.println("Write the table to which no");
        int m = sc.nextInt();
        int count =1;
        while(count <=m){
            System.out.println(n +"X" + count + "=" + n*count);
            count++;
        }
    }
}

import java.util.*;
public class print_even {
    public static void main(String[] args) {
        System.out.println("Write a even to start");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Total number you want to print")
        ;
        int n = sc.nextInt();
        int count = 0;
        if (m % 2 != 0) {
            System.out.println("The number is not even, adjusting it to the next even number.");
            m = m + 1;
        }
        while(n>count){
            if(m%2==0){
                System.out.println(m);
                m+=2;
                count++;
            }

        }
    }
}

package Searching;

import java.util.Scanner;

public class LInear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array
        System.out.println("What will be the size of the array?");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the target element to search for
        System.out.println("Enter the target element you want to search for:");
        int target = sc.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element is present at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not found");
        }
    }
}

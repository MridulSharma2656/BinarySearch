package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class SqrtOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the square root : ");
        int x = sc.nextInt();
        int hi = (x-1);
        int lo = 0;
        int sqrt = 0;
        while (lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if (mid == x/mid) {
                sqrt = mid;
                break;
            }
            else if (mid < x/mid) {
                lo = mid + 1;
            }
            else if (mid > x/mid) {
                hi = mid - 1;
            }
        }
        System.out.println("The square root of " + x + " is " + sqrt);
    }
}

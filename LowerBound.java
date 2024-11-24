package SkiilsPw.BinarySearch;
import java.util.Scanner;
public class LowerBound {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the elements in the array:");
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.print("Enter the element to be found:");
        int x = sc.nextInt();
        int lo = 0;
        int hi = (n-1);
        int lb = 8;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            // FOR UPPER BOUND CONDITION(arr[mid] > x)
            if (arr[mid] >= x) {   
                lb = Math.min(mid, lb);
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        System.out.print("The Lower bound of element " + x + " is " + lb);
    }
}

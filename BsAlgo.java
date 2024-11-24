package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class BsAlgo {
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
        boolean flag = false;
        int lo = 0;
        int hi = (n-1);
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid] == x) {
                flag = true;
                System.out.println("The target element " + x + " found at position " + mid);
                break;
            }
            else if (arr[mid] < x) {
                lo = mid+1;
            }
            else if (arr[mid] > x) {
                hi = mid-1;
            }
        }
        if (flag == false) { 
            System.out.println("Element " + x + " not found");
        }
    }
}

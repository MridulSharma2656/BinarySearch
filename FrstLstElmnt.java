package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class FrstLstElmnt {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element number " + (i+1) + " in the array : ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.print("Enter the element to be found : ");
        int x = sc.nextInt();
        int lo = 0;
        int hi = (n-1);
        int fp = -1;
        while (lo<=hi) {
            int mid = lo + ( hi-lo)/2;
            if (arr[mid] == x) {
                if (arr[mid-1] == arr[mid] && mid>0) {
                    hi = mid - 1;
                }
                else {
                    fp = mid;
                    break;
                }
            }
            else if (arr[mid] < x) {
                lo = mid + 1;
            }
            else if (arr[mid] > x) {
                hi = mid - 1;
            }
        }
        System.out.print(fp + " ");
        int lp = -1;
        lo = 0;
        hi = n-1;
        while (lo<=hi) {
            int mid =lo + ( hi-lo)/2;
            if (arr[mid] == x) {
                if (arr[mid+1] == arr[mid] && (mid+1)<n) {
                    lo = mid + 1;
                }
                else {
                    lp = mid;
                    break;
                }
            }
            else if (arr[mid] < x) {
                lo = mid + 1;
            }
            else if (arr[mid] > x) {
                hi = mid - 1;
            }
        }
        System.out.print(lp);
    }
}
package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class ElmntRotatedArray {
     public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int bs(int[] arr,int lo,int hi,int x){
        int idx = -1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid] == x) {
                idx = mid;
                return idx;
            }
            else if (arr[mid] < x) {
                lo = mid+1;
            }
            else if (arr[mid] > x) {
                hi = mid-1;
            }
        }
        return -1;
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
        if (n<=2) {
            for( i = 0;i<n;i++){
                if (arr[i] == x) {
                    System.out.println("Element " + x + " found at position " + i);
                }
            }
        }
        int lo = 1;
        int hi = (n-2);
        int p = -1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                p = mid;
                break;
            }
            else if (arr[mid] < arr[mid+1] && arr[mid] < arr[mid-1]) {
                p = mid;
                break;
            }
            else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                if (arr[mid] > arr[n-1]) {
                    lo = mid + 1;
                }
                else{
                    hi = mid - 1;
                }
            }
        }
        if (p==-1) {
            int pos = bs(arr, 0, n-1 ,i);
            System.out.println("Element " + x + " found at position " + pos);
        }
        int left = bs(arr, 0, p, x);
        if (left != -1) {
            System.out.println("Element " + x + " found at position " + left);
        }
        else{
            int right = bs(arr, (p+1), (n-1), x);
            System.out.println("Element " + x + " found at position " + right);
        }
    }
}

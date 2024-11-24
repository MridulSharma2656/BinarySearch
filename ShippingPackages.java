package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class ShippingPackages {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static boolean isPossible(int[] arr,int n,int c,int d){
        int load = 0;
        int days = 1;
        for(int j = 0;j<n;j++){
            if (load + arr[j] <= c) {
                load += arr[j];
            }
            else{
                load = arr[j];
                days++;
            }
        }
        if (days>d) {
            return false;
        }
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element " + (i+1) + " in the array: ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.print("Enter the number of days : ");
        int d = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int j = 0;j<n;j++){
            mx = Math.max(mx, arr[j]);
            sum += arr[j];
        }
        int lo = mx ; 
        int hi = sum;
        int c = sum;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr,n,mid,d)){
                c = mid;
                hi = mid - 1;
            }
            else  {
                lo = mid + 1;
            }
        }
        System.out.print(c+" ");
    }
}

package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class MinimizeProductDistribution {
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static boolean isPossible(int[] arr,int mid,int hi,int l,int n){
        int str = 0;
        for(int j = 0;j<l;j++){
            if(arr[j]%mid==0){
                str += arr[j]/mid;
            }
            else {
                str += arr[j]/mid + 1;
            }
        }
        if(str>n){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int l = sc.nextInt();
        int[]arr = new int[l];
        int i;
        for(i=0;i<l;i++)
        {
            System.out.print("Enter the element " + (i+1) + " in the array: ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.print("Enter the number of stores : ");
        int n = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        for(int j = 0;j<l;j++){
            mx = Math.max(mx, arr[j]);
        }
        int lo = 1 ; 
        int hi = mx;
        int maxQ = 0;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if (isPossible(arr,mid,hi,l,n) == true) {
                maxQ = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        System.out.print("The minimized maximum distribution to " + n + " stores is "+ maxQ );
    }
}

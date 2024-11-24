package SkiilsPw.BinarySearch;

import java.util.Scanner;

public class SmlstDivisor {
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static boolean sum(int[] arr,int n,int mid,int t){
        int s = 0;
        for(int i = 0;i<n;i++){
            if (arr[i]%mid==0) {
                s += (arr[i])/mid;
            }
            else s+= (arr[i]/mid) + 1;
        }
        if (s<=t) {
            return true;
        }
        else return false;
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
        System.out.print("Enter the threshold number : ");
        int t = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        for(int j = 0;j<n;j++){
            mx = Math.max(mx, arr[j]);
        }
        int lo = 1;
        int hi = mx;
        int d = 1;
        while (lo <=hi) {
            int mid = lo + (hi-lo)/2;
            if(sum(arr,n,mid,t)){
                d = mid;
                hi = mid - 1;
            }
            else  {
                lo = mid + 1;
            }
        }
        System.out.print(d);
    }
}


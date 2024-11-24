package SkiilsPw.BinarySearch;

import java.util.ArrayList;

import java.util.Scanner;

public class FindClosestKElements {
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
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
        System.out.print("Enter the element to be found : ");
        int x = sc.nextInt();
        System.out.print("Enter the range of closing elements : ");
        int k = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>(n);
            int lo = 0;
            int hi = (n - 1);
            int lb = n;
            while (lo <= hi) {
                int mid = lo + (hi-lo)/2;
                if (arr[mid] >= x) {   
                    lb = Math.min(mid, lb);
                    hi = mid - 1;
                }
                else {
                    lo = mid + 1;
                }
            }
            i = lb - 1;
            int j = lb;
            while (k > 0 ) {
                    int a = Math.abs(x - arr[i]);
                    int b = Math.abs(x - arr[j]);
                    if (a <= b) {
                        ls.add(arr[i]);
                        i--;
                        k--;
                    }
                    else{
                    ls.add(arr[j]);
                    j++;
                    k--;
                    }
                    while (i<0 && k > 0) {
                        
                            ls.add(j);
                            j++;
                            k--;
                    }
                    while (j==n && k > 0) {
                        
                            ls.add(i);
                            i--;
                            k--;
                    }
                }
        for (Integer ele : ls) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

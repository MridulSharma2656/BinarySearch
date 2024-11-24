package SkiilsPw.BinarySearch;
import java.util.Scanner;
public class MountainPeakIndex {
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
        int lo = 1;
        int hi = n-2;
        int mo = 0;
        int moidx = -1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                mo = arr[mid];
                moidx = mid;
                break;
            }
            else if(arr[mid] < arr[mid-1]){
                hi = mid-1;
            }
            else if (arr[mid] < arr[mid+1]) {
                lo = mid+1;
            }
        }
       System.out.println("The Mountain Number in the array is " + mo + " with index number " + moidx);
    }
}

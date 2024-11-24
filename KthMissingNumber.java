package SkiilsPw.BinarySearch;
import java.util.Scanner;
public class KthMissingNumber {
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
        System.out.print("Enter the missing number to find  : ");
        int k = sc.nextInt();
            int lo = 0;
            int hi = n - 1;
            int missed = 0;
            while(lo<=hi){
                int mid = lo + (hi - lo)/2;
                missed = arr[mid] - (mid+1);
                if(missed>=k){
                    hi = mid - 1 ;
                }
                else {
                    lo = mid + 1; 
                }
            }
            int element = k + lo;
            System.out.println("The "+ k + "missing element is "+ element);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class MargetwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();;
        int[] arr=new int[n];
        int[] brr=new int[m];
        int[] a=new int[m+n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            brr[i]=sc.nextInt();
        }
        sort(arr,brr,a);
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
    }

    private static int[] sort(int[] arr, int[] brr, int[] a) {
        int i=0,j=0,k=0;
        while(i<arr.length &&j<brr.length){
            if(arr[i]<=brr[j]) a[k++]=arr[i++];
            else a[k++]=brr[j++];
        }
        while(j<brr.length) {
            a[k++]=brr[j++];
        }
        while(i<arr.length){
            a[k++]=arr[i++];
        }
        return a;
    }
}

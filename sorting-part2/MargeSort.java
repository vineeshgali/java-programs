import java.util.Scanner;

public class MargeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        print(arr);
        margesort(arr);
        print(arr);
    }

    private static void margesort(int[] arr) {
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i]=arr[i];
        }
        for (int i = 0; i < n/2; i++) {
            b[i]=arr[i+n/2];
        }
        margesort(a);
        margesort(b);
        marge(a,b,arr);
    }

    private static void marge(int[] a, int[] b, int[] arr) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i] <= b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<a.length){
            arr[k++] = a[i++];
        }
        while(j<b.length){
            arr[k++] = b[j++];
        }
    }

    private static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}

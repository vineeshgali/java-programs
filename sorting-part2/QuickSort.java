import java.util.Scanner;

public class QuickSort {
    private static void print(int[] arr) {
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        quick(arr,0,arr.length-1);
        print(arr);
    }
    private static void quick(int[] arr, int lo, int hi) {
        if(lo>=hi) return;
        int indx=partition(arr,lo,hi);
        quick(arr,lo,indx-1);
        quick(arr,indx+1,hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int count=0;
        int mid=(lo+hi)/2;
        int pivote=arr[mid];
        int pindx=mid;
        for (int i = lo; i < arr.length; i++) {
            if(i==mid) continue;
            if(arr[i]<pivote) count++;
        }
        int ctr=count+lo;
        int i=0,j=hi;
        while(i<ctr && j>ctr){
            if(arr[i]<=arr[ctr]) i++;
            else if(arr[j]>arr[ctr]) j++;
            else if(arr[i]>arr[ctr] && arr[ctr]>arr[j]){
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return ctr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

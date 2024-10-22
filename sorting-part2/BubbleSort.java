import java.util.Scanner;

public class BubbleSort {
    public static boolean sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(sort(arr)) break;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}

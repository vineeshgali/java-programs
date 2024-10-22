import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

import java.util.Scanner;

public class SelectinSort {
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
            int min=i;
            for (int j = i; j < n; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void sort(int[] arr,int n){
       for(int i=1;i<n;i++){
           int key=arr[i];
           int j=i-1;
           while(j>=0&&key<arr[j]){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=key;
       }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr,n);
    }
}

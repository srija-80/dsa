public class PrintArrRecur {
    public static int print(int[] arr, int i,int target) {
        if(i>=arr.length) {
            return -1;
        }
        if(arr[i]==target){
            return i;
        }

         return print(arr,i+1,target);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int target=4;
        System.out.println(print(arr,0,target));
    }
}

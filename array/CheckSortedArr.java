public class CheckSortedArr {
    public static boolean checksort(int[] arr, int i) {
        if(i>=arr.length-1) {
            return true;
        }
        if(arr[i]<arr[i+1]){
           return checksort(arr,i+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        System.out.println(checksort(arr,0));
    }
}

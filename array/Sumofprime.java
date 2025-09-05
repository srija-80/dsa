class Sumofprime{
    public static void main(String[] args) {
        int l=15,r=25;
        int[] arr= new int[r+1];
        for(int i=0;i<=r;i++){
            arr[i]=1;
        }
        for(int i=2;i*i<=r;i++){
            if(arr[i]==1){
                for(int j=i*2;j<=r;j+=i){
                    arr[j]=0;
                }
            }
        }
        int sum=0;
        for(int i=l;i<=r;i++){
            if(arr[i]==1){
                sum+=i;
            }
        }
        System.out.println("sum = "+sum);
    }
}

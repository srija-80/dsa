//GeeksforGeeks
class CountInversion {
    public static int merge(int[] arr,int low,int mid,int high){ 
     ArrayList<Integer> temp=new ArrayList<>();
     int l=low;
      int r=mid+1;
      int cnt=0;
      while(l<=mid && r<=high){
          if(arr[l]<=arr[r]){
          temp.add(arr[l]);
          l++;
          }
          else{
              temp.add(arr[r]);
              r++;
              cnt+=(mid-l+1);
          }}
          while(l<=mid){
              temp.add(arr[l]);
              l++;
          }
          while(r<=high){
              temp.add(arr[r]);
              r++;
          }
          for(int i=low;i<=high;i++){
              arr[i]=temp.get(i-low);
                      }
            return cnt;    
    }

  public static int mergeSort(int[] arr,int low,int high){
      int cnt=0;
      if(low>=high)
          return cnt;
      
      int mid=(low+high)/2;
      cnt+=mergeSort(arr,low,mid);
      cnt+=mergeSort(arr,mid+1,high);
      cnt+=merge(arr,low,mid,high);
      return cnt;
  }
  static int inversionCount(int[] arr){
     int n=arr.length;
     return mergeSort(arr,0,n-1);
  }
}

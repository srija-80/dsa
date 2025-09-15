class MergeSort{
    void mergesort(int arr[], int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        else{
            return;
        }
    }
    void merge(int[] arr,int l,int mid,int r){
        int[] a = new int[r-l+1];
        int left=l;
        int right=mid+1;
        int i=0;
        while(left<=mid&&right<=r){
            if(arr[left]<=arr[right]){
                a[i]=arr[left];
                i++;
                left++;
            }
            else{
                a[i]=arr[right];
                i++;
                right++;
            }
        }
        while(left<=mid){
            a[i]=arr[left];
            i++;
            left++;
        }
        while(right<=r){
            a[i]=arr[right];
            i++;
            right++;
        }
       for(int j=0;j<a.length;j++){
           arr[l+j]=a[j];
       }
    }
}

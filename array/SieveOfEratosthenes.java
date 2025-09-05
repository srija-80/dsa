class SieveOfEratosthenes {
    public int[] sieve(int n) {
        ArrayList<Integer> l=new ArrayList<>();
        int[] a= new int[n+1];
        for(int i=2;i<=n;i++){
            a[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(a[i]==1){
                for(int j=i*2;j<=n;j+=i){
                    a[j]=0;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(a[i]==1){
                l.add(i);
            }
        }
        int[] prime= new int[l.size()];
        for(int i=0;i<l.size();i++){
            prime[i]=l.get(i);
        }
        return prime;
    }
}

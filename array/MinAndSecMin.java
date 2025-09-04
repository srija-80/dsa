class MinAndSecMin {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secSmall=small;
                small=arr[i];
            }
            else if(arr[i]>small&&arr[i]<secSmall){
                secSmall=arr[i];
            }
        }
        if(secSmall==Integer.MAX_VALUE){
        a.add(-1);
        }
    else{
       a.add(small);
        a.add(secSmall);
    }
    return a;
    }
}

class SquareDiff {
    static long squaresDiff(int N) {
        long sq=0, sum=0;
        for(int i=1;i<=N;i++){
            sq=sq+(i*i);
            sum+=i;
        }
        long res= (long)(sq-Math.pow(sum,2));
        if(res<0){
            return -res;
        }
        else{
            return res;
        } 
    }
}

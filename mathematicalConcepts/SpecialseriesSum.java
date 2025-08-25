class SpecialseriesSum {
    static long sumOfTheSeries(long n) {
        int sum=0,seriesTerm=0;
        for(int i=1;i<=n;i++){
           sum+=i;
           seriesTerm+=sum;
        }
        return seriesTerm;
    }
}

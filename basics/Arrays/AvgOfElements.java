class AvgOfElements {
    public static double posAverage(int[] arr) {
        // Code here
        int sum=0;
        int avgcount=0;
        for(int n:arr){
            if(n>0||n==0){
            sum=sum+n;
            avgcount++;
        }
        }
        return (double)sum/avgcount;
    }
}

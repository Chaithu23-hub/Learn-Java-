class ColumnSum {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int n=mat.length;//rows length
        int m=mat[0].length;//col length
        int temp[]=new int[m];
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                temp[j]+=mat[i][j];
            }
        }
        return temp;
    }
}

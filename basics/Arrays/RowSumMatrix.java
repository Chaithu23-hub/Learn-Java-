class RowSumMatrix {
    public static int[] rowSum(int matrix[][]) {
        // Code here
        int temp[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                sum=sum+matrix[i][j];
            }
            temp[i]=sum;
        }
        return temp;
    }
}

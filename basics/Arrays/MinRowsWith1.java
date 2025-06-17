class MinRows {
    int minRow(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=mat[i][j];
            }
            if(sum<min){
               min=sum;
               index=i+1;
        }
    }
        return index;
    }
}

/*
Given a 2D binary matrix(1-based indexed) mat of dimensions nxm , determine the row that contains the minimum number of 1's.
Note: The matrix contains only 1's and 0's. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices.

Examples :

Input: mat = [[1, 1, 1, 1], [1, 1, 0, 0], [0, 0, 1, 1], [1, 1, 1, 1]]
Output: 2
Explanation: Rows 2 and 3 contain the minimum number of 1's (2 each). Since, row 2 is less than row 3. Thus, the answer is 2.
Input: mat = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
Output: 1
Explanation: All the rows contain the same number of 1's (0 each). Among them, index 1 is the smallest, so the answer is 1. */

// User function Template for Java

class Solution {
    // Function to return list of integers visited in snakepattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        int N=matrix.length;
        ArrayList<Integer> result =new ArrayList<>();
        for(int i=0;i<N;i++){
            if(i%2==0){
                for(int j=0;j<N;j++){
                    result.add(matrix[i][j]);
                }
            }else{
                    for(int j=N-1;j>=0;j--){
                        result.add(matrix[i][j]);
                    }
                }
            }
            return result;
        }
    }


/*
Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.


Examples :

Input: N = 3, matrix[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
Output: 45 48 54 87 89 21 70 78 15 
Explanation: Printing it in snake pattern will lead to the output as 45 48 54 87 89 21 70 78 15.
Input: N = 2, matrix[][] = [[1, 2], [3, 4]]
Output: 1 2 4 3 
Explanation: Printing it in snake pattern will give output as 1 2 4 3. */


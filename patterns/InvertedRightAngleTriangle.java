class InvertedRightAngleTriangle{
    public void printPattern(int n) {
        // Code here
        int i=n;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

/* Input: n = 4
Output:
* * * * 
* * * 
* * 
*
Explanation: Length of perpendicular and base of triangle is 4 .
Input: n = 3
Output:
* * * 
* * 
*
Explanation: Length of perpendicular and base of triangle is 3 .*/

class RightAngledWithSpace{
    public void printPattern(int n) {
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
               if(j==1||j==i||i==n){
                   System.out.print("* ");
                   j++;
               }else{
                   System.out.print("  ");
                   j++;
               }
               
            }
            System.out.println();
            i++;
        }
    }
}


/* Input: n = 9
Output:
*
* *
*   *
*     *
*       *
*         *
*           *
*             *
* * * * * * * * * 
Explanation: Length of perpendicular and base of triangle is 9.
Input: n = 4
Output:
*
* *
*   *
* * * *
Explanation: Length of perpendicular and base of triangle is 4. */



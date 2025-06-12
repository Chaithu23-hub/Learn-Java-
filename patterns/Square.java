import java.util.*;

public class Square{
    public static void solve() {
        // Your Code Here
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int col=1;
     while(col<=n){
         int rows=1;
         while(rows<=n){
             if(col==1||rows==n||rows==1||col==n){
                 System.out.print("* ");
                 rows++;
             }else{
                 System.out.print("  ");
                 rows++;
             }
         }
             System.out.println();
             col++;
             
             
         }
         
    }
        
}

/* Input: n = 4
Output:
* * * *
*     *
*     *
* * * *
Explanation: It's a square! Each side contains n = 4 .
Input: n = 3
Output:
* * * 
*   *
* * *
Explanation: It's a square! Each side contains n = 3 .*/




import java.util.*;

public class Solution {
    public static void solve() {
        try (// Your Code Here
    Scanner sc = new Scanner(System.in)) {
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
         public static void main(String[] args){
           solve();

         } 
        
}
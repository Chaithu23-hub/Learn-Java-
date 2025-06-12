
import java.util.Scanner;

public class RightAngleTriangle{
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print right angle triangle of size n
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}


//Input: n = 4
//Output:
//* 
//* * 
//* * * 
//* * * * 
//Explanation: Length of perpendicular and base of triangle is 4 .
//Input: n = 3
//Output:
//* 
//* * 
//* * * 
//Explanation: Length of perpendicular and base of triangle is 3 



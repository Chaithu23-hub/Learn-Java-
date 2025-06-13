import java.util.*;

public class NthFibonacciNumber {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibb(n));
    }
    public static int fibb(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}

/* Input: n = 4
Output: 3
Explanation: In the series 0 1 1 2 3 5...... the fourth fibonacci number is 3.
Input: n = 5
Output: 5
Explanation: In the series 0 1 1 2 3 5 8...... the fifth fibonacci number is 5. */

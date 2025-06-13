import java.util.Scanner;

public class LCM {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // take input and print their LCM
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=CalLCM(a,b);
        System.out.println(lcm);
    }
        public static int CalLCM(int a,int b){
            int gcd=CalGCD(a,b);
            return(a*b)/gcd;
        }
        public static int CalGCD(int a,int b){
            if(b==0){
                return a;
            }
            return CalGCD(b,a%b);
        }
        
}

/* Input: a = 5, b = 10
Output: 10
Explanation: LCM of 5 and 10 is 10
Input: a = 14, b = 8
Output: 56
Explanation: LCM of 14 and 8 is 56 */

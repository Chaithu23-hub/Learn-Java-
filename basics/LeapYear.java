//Back-end complete function Template for Java
import java.util.*;

public class LeapYear {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code here
        System.out.println(n%400==0?"True":(n%100==0?"False":(n%4==0?"True":"False")));
    }
}

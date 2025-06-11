//Back-end complete function Template for Java
import java.util.*;

public class CountOfDigits {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}

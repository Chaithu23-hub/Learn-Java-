import java.lang.*;
import java.util.*;

class ConcateIntegers {
    public static void main(String[] args) {
      //Scanner class to take input from user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      //coverting Integers to String
        String c = Integer.toString(a);
        String d = Integer.toString(b);
      //concatenating 2 integers
        System.out.println(c+d);
        
    }
}

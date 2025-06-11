//Back-end complete function Template for Java
import java.util.*;

public class SwitchStatements {
    public static String getNumber(int a) {
        // Your Code Here
        switch(a){
            case 1:
                return "One";
                //break;
            case 2:
                return "Two";
                //break;
            case 3:
                return "Three";
                //break;
            case 4:
                return "Four";
                //break;
            case 5:a
                return "Five";
                //break;
            case 6:
                return "Six";
                //break;
            case 7:
                return "Seven";
                //break;
            case 8:
                return "Eight";
                //break;
            case 9:
                return "One";
                //break;
            default:
            return "Unknown";
        }
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(getNumber(a));
        
    }
}

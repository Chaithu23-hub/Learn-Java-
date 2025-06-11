import java.util.*;

class StringInput {
    public static void main(String args[]) {
        // Take String Input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        
        // Print it
        System.out.println(s);
        
        sc.close(); // Always good to close the scanner
    }
}

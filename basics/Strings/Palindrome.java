import java.io.*;

class GFG {
    public static void main (String[] args) {
        String s = "abba";

        // Initialize pointers
        int start = 0;
        int end = s.length() - 1;
        boolean isPal = true;

        // Check for palindrome
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }

        // Output the result
        if (isPal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

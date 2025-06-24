import java.io.*;

class GFG {
    public static void main(String[] args) {
        String txt = "geeks for geeks";
        String pat = "geek";
        patternSearch(txt, pat);
    }

    public static void patternSearch(String txt, String pat) {
        int pos = txt.indexOf(pat);
        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
    }
}


/*
Java Sample Problem - Pattern Searching
Problem 1: Finding All Occurrences of a Pattern in a String

Given a text string (txt) and a pattern string (pat), find all positions where the pattern appears in the text.

Examples:

Input: txt ="geeks for geeks"
pat = "geek"
Output: 0 10

Input: txt ="abcd pqcda"
pat = "cd"
Output: 2 7

Now, let's see the process, how we can solve this question:

Use the indexOf method to find the first occurrence of the pattern in the text.
Continue searching for subsequent occurrences by starting from the position after the last match.
Print all positions where the pattern occurs.
*/

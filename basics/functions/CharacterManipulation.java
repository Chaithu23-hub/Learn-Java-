class Solution {

    /**
     * This method modifies every character at even index (0, 2, 4...) 
     * by shifting it forward by the numeric value present at the next index (1, 3, 5...).
     * The alphabet wraps from 'z' to 'a'.
     *
     * @param s The input string in which every alternate character is a digit.
     * @return The transformed string.
     */
    public String manipulateIt(String s) {
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i); // letter
            int n = Character.getNumericValue(s.charAt(i + 1)); // number

            // Shift character forward 'n' times
            for (int j = 0; j < n; j++) {
                c++;
                if (c > 'z') {
                    c = 'a'; // wrap around after 'z'
                }
            }

            r.append(c); // append transformed character
        }

        return r.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "a1c1e1"; // Sample input
        String result = sol.manipulateIt(input);
        System.out.println("Manipulated String: " + result);
    }
}

/*
Sample Output:
Manipulated String: bdf
*/
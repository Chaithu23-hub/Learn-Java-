import java.util.*;

class Solution {

    /**
     * Finds the smallest positive integer that is not present in the list.
     * 
     * @param numbers A list of integers which may include negative and duplicate numbers.
     * @return The smallest missing positive integer.
     */
    public int missingPositiveNumber(ArrayList<Integer> numbers) {
        HashSet<Integer> set = new HashSet<>();

        // Add all positive numbers to the set
        for (int num : numbers) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Check the smallest missing positive starting from 1
        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                return i;
            }
            i++;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, -1, 1));
        int result = sol.missingPositiveNumber(nums);
        System.out.println("Smallest Missing Positive Number: " + result);
    }
}

/*
Sample Output:
Smallest Missing Positive Number: 2
*/
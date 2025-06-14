// Java program to find the first digit of a given number
class FirstDigit {
    
    /**
     * Function to find the first digit of a number
     * @param n - the input number
     * @return - the first digit of the number
     */
    public static int firstDigit(int n) {
        // Keep dividing n by 10 until it reduces to a single-digit number
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        // Example test cases
        int num1 = 123;
        int num2 = 976;
        
        // Printing results
        System.out.println("First digit of " + num1 + " is: " + firstDigit(num1)); // Output: 1
        System.out.println("First digit of " + num2 + " is: " + firstDigit(num2)); // Output: 9
    }
}

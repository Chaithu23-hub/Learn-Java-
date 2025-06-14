// Java program to find the prime factorization of a number
class PrimeFactorization {

    /**
     * Function to print the prime factors of a given number in non-decreasing order.
     * @param n - the input number
     */
    public static void printPrimeFactorization(int n) {
        // Start with 2, the smallest prime number
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2; // Divide n by 2 until it is no longer divisible
        }

        // Check for odd factors starting from 3
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is still greater than 1, it must be a prime number
        if (n > 1) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        // Example test cases
        int num1 = 100;
        int num2 = 27;

        System.out.print("Prime factorization of " + num1 + ": ");
        printPrimeFactorization(num1); // Output: 2 2 5 5
        System.out.println(); // Move to next line

        System.out.print("Prime factorization of " + num2 + ": ");
        printPrimeFactorization(num2); // Output: 3 3 3
        System.out.println(); // Move to next line
    }
}

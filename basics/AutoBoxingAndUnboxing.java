// Java program to demonstrate Autoboxing and Unboxing

class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        // Autoboxing: Converting int to Integer
        int x1 = 10;
        Integer x2 = x1; // Autoboxing

        // Unboxing: Converting Integer to int
        int x3 = x2; // Unboxing

        // Print values
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
    }
}

// Output
// x1: 10
// x2: 10
// x3: 10
 

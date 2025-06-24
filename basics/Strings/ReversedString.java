class GFG {
    public static void main(String[] args) {
        String a = "geeks";               
        String b = "";                     

        int ptr = a.length() - 1;         

        // Loop through the string in reverse order
        while (ptr >= 0) {
            b = b + a.charAt(ptr);         
            ptr--;                         
        }

        System.out.println("Reversed string: " + b); 
    }
}

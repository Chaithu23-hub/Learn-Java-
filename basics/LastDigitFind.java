class LastDigitFind {
    public static  int lastDigit(int n) {
        // Code here
        return Math.abs(n%10);
    }
    public static void main(String[] args) {
         LastDigitFind s =new LastDigitFind();
        int a =LastDigitFind.lastDigit(1023);
        System.out.println(a);
    }
}

import java.io.*;

class GFG {
    public static void main(String[] args) {
        String no = "12.5318";
        System.out.println(digitsAfterDecimal(no));
    }
    public static String digitsAfterDecimal(String no) {
        int pos = no.indexOf('.');
        if (pos < 0)
            return "";  // No decimal point found
        else
            return no.substring(pos + 1);
    }
}

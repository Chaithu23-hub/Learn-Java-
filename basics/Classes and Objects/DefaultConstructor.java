import java.math.*;
import java.io.*;
import java.util.*;

class Point
{
    int x, y;

    // Method to print the coordinates
    void print()
    {
        System.out.println("x = " + x + ", y = "+y);
    }
}
public class Test
{ 
    public static void main(String[] args)throws IOException 
    { 
        Point p = new Point();

        p.print();
    } 
}

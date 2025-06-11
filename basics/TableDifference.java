import java.util.*;

public class TableDifference{
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i=1;
        while(i<10){
            if(n1>n2){
                System.out.print((n1*i)-(n2*i)+" ");
                i++;
            }
        }
    }
}
// output
//


import java.util.Scanner;

public class TriangleNumbersOnSameLine {

    public static void solve(){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int col=1;
            while(col<=n){
                int row=1;
                while(row<=col){
                    System.out.print(col);
                    row++;
                }
                System.out.println();
                col++;
            }
        }
        

    }
    public static void main(String[] args) {
        solve();

}

}

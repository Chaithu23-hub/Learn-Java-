
public class Square {
    public static void main(String[] args) {
        int n=5;
        int col=1;
        while(col<=n){
            int rows=1;
            while(rows<=n){
                System.err.print("* ");
                rows++;
            }
            System.err.println();
            col++;
        }
    }
}

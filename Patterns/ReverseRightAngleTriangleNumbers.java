public class ReverseRightAngleTriangleNumbers {

    public static void main(String[] args) {
        int n=5;
        int col=1;
        while(col<=n){
            int rows=n;
            while(rows>=col){
                System.out.print(n-rows+1);
                rows--;
            }
            System.out.println();
            col++;
        }
    }
}

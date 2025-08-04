public class RightTrainglePattern {
        public static void main(String[] args) {
      int n=5;
        int col=1;
        while(col<=n){
            int rows=1;
            while(rows<=col){
                System.out.print("* ");
                rows++;
            }
            System.out.println();
            col++;
        }
    }
}

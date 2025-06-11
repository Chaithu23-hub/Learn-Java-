
public class SumOfNaturalNum {
    public static int sumOfFirstN(int n) {
        // code here
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        SumOfNaturalNum s =new SumOfNaturalNum();
        int a =SumOfNaturalNum.sumOfFirstN(10);
        System.out.println(a);
    }

}

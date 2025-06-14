
class BasicFunc {
    
    // code here
    public static int returnValueFunction(int n){
        return n*2;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int res=returnValueFunction(n);
        System.out.println(res);
    }
}

//output
// 4

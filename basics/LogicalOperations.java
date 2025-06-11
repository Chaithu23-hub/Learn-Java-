class LogicalOperations {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        boolean  c=a&&b;
        boolean  d=a||b;
        boolean  e = !a;
        return c+" "+d+" "+e;
        
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println(sol.booleanOperations(true,false));
    }
}
